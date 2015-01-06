package com.dptechdev.springcatalog.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dptechdev.repositories.ProductRepository;
import com.dptechdev.springcatalog.entities.Product;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
public class ProductRepositoryTest {
	
	@Autowired
	ProductRepository repo;
	
	@Test
	public void test() {
		Product product1 = new Product();
		product1.setName("PS4");
		product1.setCategory("Electronics");
		product1.setPrice(400);
		product1.setUrl("www.playstation.com");
		
		repo.save(product1);
		
		Product savedToDatabaseSuccessfully = repo.findOne(product1.getId());
		assertNotNull(savedToDatabaseSuccessfully);
	}

}
