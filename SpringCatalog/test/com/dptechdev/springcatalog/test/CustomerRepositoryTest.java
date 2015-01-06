package com.dptechdev.springcatalog.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dptechdev.springcatalog.entities.Customer;
import com.dptechdev.repositories.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
public class CustomerRepositoryTest {
	
	@Autowired
	CustomerRepository repo;
	
	@Test
	public void test() {
		
		Customer cust1 = new Customer();
		cust1.setFname("Derek");
		cust1.setLname("Pauley");
		cust1.setPhone("555-555-5555");
		cust1.setEmail("dptechdev@fakeEmail.com");
		
		repo.save(cust1);
		
		Customer savedToDatabaseSuccessfully = repo.findOne(cust1.getId());
		assertNotNull(savedToDatabaseSuccessfully);
		
	}

}
