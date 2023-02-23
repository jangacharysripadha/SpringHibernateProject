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
import com.chary.spring.hibernate.entities.ShopType;
import com.chary.spring.hibernate.service.ShopTypeService;



@RestController
public class ShopTypeController {
	
	@Autowired
	private ShopTypeService shopTypeService;
	
	@PostMapping("/createShopType")
	public ShopType createShopType(@RequestBody ShopType shopType) throws Exception
	{
		return shopTypeService.saveShopType(shopType);
	}
    
	@GetMapping("/selectShopType")
	public List<ShopType> getAllShopType() throws Exception
	{
		return shopTypeService.getShopTypes();
	}
	
	@GetMapping("/selectShopType/{shopTypeId}")
	public Optional<ShopType> getShopTypeById(@PathVariable int shopTypeId)throws Exception
	{
		return shopTypeService.getShopTypeById(shopTypeId);
	}
    
	
	@DeleteMapping("/deleteShopType/{shopTypeId}")
	public String deleteRole(@PathVariable int shopTypeId)throws Exception
	{
		return shopTypeService.deleteShopType(shopTypeId);
	}
    
	
	@PutMapping("/updateShopType")
	public ShopType updateShopType(@RequestBody ShopType shopType) throws Exception
	{
		return shopTypeService.updateShopType(shopType);
	}

	

}
