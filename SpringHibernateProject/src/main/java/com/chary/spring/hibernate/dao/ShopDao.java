package com.chary.spring.hibernate.dao;

import org.springframework.data.repository.CrudRepository;

import com.chary.spring.hibernate.entities.Shop;

public interface ShopDao extends CrudRepository<Shop,Integer> {


}
