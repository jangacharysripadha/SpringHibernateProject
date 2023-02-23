package com.chary.spring.hibernate.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chary.spring.hibernate.dao.ShopDao;
import com.chary.spring.hibernate.entities.Shop;


@Service
@Transactional
public class ShopServiceImpl implements ShopService {
	@Autowired
	private ShopDao shopDao;

	@Override
	public Shop saveShop(Shop shop) throws Exception {
		
		return shopDao.save(shop);
	}

	@Override
	public List<Shop> getShop() throws Exception {
		
		return (List<Shop>) shopDao.findAll();
	}

	@Override
	public String deleteShop(int shopId) {
		shopDao.deleteById(shopId);
		return "shopId removed successfully:"+shopId;
	}

	@Override
	public Optional<Shop> getShopById(int shopId) {
		return shopDao.findById(shopId);
		
	}

	@Override
	public Shop updateShop(Shop shop) {
	    return shopDao.save(shop);
	}
	}
	

	