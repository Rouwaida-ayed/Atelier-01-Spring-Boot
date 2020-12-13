package com.example.customer.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.customer.entities.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer c);
	Customer updateCustomer(Customer c);
	void deleteCustomer(Customer c);
	 void deleteCustomerById(Long id);
	 Customer getCustomer(Long id);
	List<Customer> getAllCustomer();

}
