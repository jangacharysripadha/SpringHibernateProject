package com.chary.spring.hibernate.service;

import java.util.List;
import java.util.Optional;
import com.chary.spring.hibernate.entities.ShopType;


public interface ShopTypeService {

	public ShopType saveShopType(ShopType shopType);

	public List<ShopType> getShopTypes();

	public Optional<ShopType> getShopTypeById(int shopTypeId);

	public String deleteShopType(int shopTypeId);

	public ShopType updateShopType(ShopType shopType);

}
