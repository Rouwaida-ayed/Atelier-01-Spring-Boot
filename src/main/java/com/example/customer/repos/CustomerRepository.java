package com.example.customer.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
		List<Customer> findByNomCustomer(String name);
		}

