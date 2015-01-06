package com.dptechdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dptechdev.springcatalog.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	//TODO
	
}
