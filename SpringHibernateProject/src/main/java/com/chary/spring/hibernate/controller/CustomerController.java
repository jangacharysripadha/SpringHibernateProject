package com.chary.spring.hibernate.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chary.spring.hibernate.entities.Customer;
import com.chary.spring.hibernate.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/createCustomer")
	public Customer createCustomer(@RequestBody Customer customer) throws Exception
	{
		return customerService.saveCustomer(customer);
	}
    
	@GetMapping("/selectCustomer")
	public List<Customer> getAllCustomers() throws Exception
	{
		return customerService.getCustomer();
	}
	
	@GetMapping("/selectCustomer/{customerId}")
	public Optional<Customer> getCustomerById(@PathVariable int customerId)throws Exception
	{
		return customerService.getCustomerById(customerId);
	}
    
	
	@DeleteMapping("/deleteCustomer/{customerId}")
	public String deleteCustomer(@PathVariable int customerId)throws Exception
	{
		return customerService.deleteCustomer(customerId);
	}
    
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) throws Exception
	{
		return customerService.updateCustomer(customer);
	}

	
	
	
	
	

}
