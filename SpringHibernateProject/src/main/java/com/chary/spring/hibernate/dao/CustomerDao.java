package com.chary.spring.hibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chary.spring.hibernate.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer,Integer> {

}
