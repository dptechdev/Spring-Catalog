package com.dptechdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dptechdev.springcatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	//TODO
	
}
