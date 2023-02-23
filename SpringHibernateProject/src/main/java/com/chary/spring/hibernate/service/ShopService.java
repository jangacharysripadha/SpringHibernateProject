package com.chary.spring.hibernate.service;

import java.util.List;
import java.util.Optional;

import com.chary.spring.hibernate.entities.Shop;



public interface ShopService  {

	public Shop saveShop(Shop shop) throws Exception;

	public List<Shop> getShop()throws Exception;

	public String deleteShop(int shopId);

	public Optional<Shop> getShopById(int shopId);

	public Shop updateShop(Shop shop);

	
	
    
}