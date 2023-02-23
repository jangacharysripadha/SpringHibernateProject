package com.chary.spring.hibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chary.spring.hibernate.entities.Account;


public interface AccountDao extends JpaRepository<Account,Integer>{

}