package com.chary.spring.hibernate.service;

import java.util.List;
import java.util.Optional;

import com.chary.spring.hibernate.entities.Customer;


public interface CustomerService {

	public Customer saveCustomer(Customer customer)throws Exception;

	public List<Customer> getCustomer()throws Exception;

	public Optional<Customer> getCustomerById(int customerId)throws Exception;

	public String deleteCustomer(int customerId)throws Exception;

	public Customer updateCustomer(Customer customer)throws Exception;

}