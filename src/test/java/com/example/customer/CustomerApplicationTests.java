package com.example.customer;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.example.customer.entities.Customer;
import com.example.customer.repos.CustomerRepository;
import com.example.customer.service.CustomerService;


@SpringBootTest
class CustomerApplicationTests {
	@Autowired
	private CustomerRepository CustomerRepository;
	@Test
	public void  testCreateCustomer() {
		Customer cust = new Customer("folen","sousse",55555);
		CustomerRepository.save(cust);
	}
	 @Test
	 public void testFindCustomer()
	 {
		 Customer c = CustomerRepository.findById(2L).get();
	 System.out.println(c);
	 }
	 @Test
	 public void testUpdateCustomer()
	 {
		 Customer c = CustomerRepository.findById(2L).get();
	 c.setAdresse("Korea");
	 CustomerRepository.save(c);
	 }
	 @Test
	 public void testDeleteCustomer() {
		 CustomerRepository.deleteById(2L);;

	 }
	 @Test
	 public void testListerTousCustomer()
	 {
		 List<Customer> cust = CustomerRepository.findAll();
		 for (Customer c:cust)
		 {
		 System.out.println(c);
		 
		 
}}
		 @Test
		 public void testFindCustomerByNom()
		 {
			List<Customer> cust= CustomerRepository.findByNomCustomer("mouhamed");
			 for (Customer c :cust)
			 {
		 System.out.println(c);
		 }}
		
}
	

	 
	 
	 
	 
	 
	 
