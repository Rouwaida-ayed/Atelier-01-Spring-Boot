package com.example.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.customer.entities.Customer;
import com.example.customer.repos.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired

	CustomerRepository  customerRepository;

	@Override
	public Customer saveCustomer(Customer c) {
		return customerRepository.save(c);
	}

	@Override
	public Customer updateCustomer(Customer c) {
		return customerRepository.save(c);
	}

	@Override
	public void deleteCustomer(Customer c) {
	 customerRepository.delete(c);
		
	}

	@Override
	public void deleteCustomerById(Long id) {
		 customerRepository.deleteById(id);

	}

	@Override
	public Customer getCustomer(Long id) {
		 return customerRepository.findById(id).get();

	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();

	}

	
}
