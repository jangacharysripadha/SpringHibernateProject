package com.chary.spring.hibernate.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chary.spring.hibernate.dao.ShopTypeDao;
import com.chary.spring.hibernate.entities.ShopType;


@Service
@Transactional
public class ShopTypeServiceImpl implements ShopTypeService{
	
	@Autowired
	private ShopTypeDao shopTypeDao;


	@Override
	public ShopType saveShopType(ShopType shopType) {
		return shopTypeDao.save(shopType);
	}

	@Override
	public List<ShopType> getShopTypes() {
		return (List<ShopType>) shopTypeDao.findAll();
	}

	@Override
	public Optional<ShopType> getShopTypeById(int shopTypeId) {
		return shopTypeDao.findById(shopTypeId);
	}

	@Override
	public String deleteShopType(int shopTypeId) {
		shopTypeDao.deleteById(shopTypeId);
		return "shopTypeId removed successfully:"+shopTypeId;
	}

	@Override
	public ShopType updateShopType(ShopType shopType) {
		return shopTypeDao.save(shopType);
	}

}
