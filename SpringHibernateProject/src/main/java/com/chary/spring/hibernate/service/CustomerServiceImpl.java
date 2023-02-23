package com.chary.spring.hibernate.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chary.spring.hibernate.dao.CustomerDao;
import com.chary.spring.hibernate.entities.Customer;




@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;


	@Override
	public Customer saveCustomer(Customer customer) throws Exception {
		
		return customerDao.save(customer);
	}

	@Override
	public List<Customer> getCustomer() throws Exception {
		
		return (List<Customer>) customerDao.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(int customerId) throws Exception{
		
		return customerDao.findById(customerId);
	}

	@Override
	public String deleteCustomer(int customerId) throws Exception{
		
		customerDao.deleteById(customerId);
		return "customerId removed successfully:"+customerId;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws Exception{
		
		 return customerDao.save(customer);
	}

}
