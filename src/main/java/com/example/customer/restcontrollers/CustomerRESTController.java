package com.example.customer.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.entities.Customer;
import com.example.customer.service.CustomerService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class CustomerRESTController {
	@Autowired
	CustomerService customerService; 
	@RequestMapping(method = RequestMethod.GET)
	public List<Customer> getAllCustomer() {
	return customerService.getAllCustomer();
	}
	}

