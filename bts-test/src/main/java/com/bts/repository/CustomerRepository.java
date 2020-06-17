package com.bts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bts.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	Customer findByUsername(String username);
	
}
