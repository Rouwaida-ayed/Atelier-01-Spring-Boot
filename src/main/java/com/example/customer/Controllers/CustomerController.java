package com.example.customer.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.customer.entities.Customer;
import com.example.customer.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createCustomer";
	}
	@RequestMapping("/saveCustomer")
	public String saveProduit(@ModelAttribute("Customer") Customer customer, ModelMap modelMap){
	
	Customer saveCustomer = customerService.saveCustomer(customer);
	String msg ="Customer enregistré ";
	modelMap.addAttribute("msg", msg);
	return "createCustomer";
	}
	@RequestMapping("/ListeCustomer")
	public String listeCustomer(ModelMap modelMap)
	{
	List<Customer> Cust = customerService.getAllCustomer();
	modelMap.addAttribute("Customer", Cust);
	return "listeCustomer";
	}
	@RequestMapping("/supprimerCustomer")
	public String supprimerCustomer(@RequestParam("id") Long id,
	 ModelMap modelMap)
	{
	customerService.deleteCustomerById(id);
	List<Customer> cust = customerService.getAllCustomer();
	modelMap.addAttribute("Customer", cust);
	return "listeCustomer";
	}
	@RequestMapping("/modifierCustomer")
	public String editerProduit(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Customer p= customerService.getCustomer(id);
	modelMap.addAttribute("Customer", p);
	return "editerCustomer";
	}
	@RequestMapping("/updateCustomer")
	public String updateCustomer(@ModelAttribute("Customer") Customer customer,ModelMap modelMap){
	
			customerService.updateCustomer(customer);
		 List<Customer> cust = customerService.getAllCustomer();
		 modelMap.addAttribute("Customer", cust);
		return "listeCustomer";
	}

	}


