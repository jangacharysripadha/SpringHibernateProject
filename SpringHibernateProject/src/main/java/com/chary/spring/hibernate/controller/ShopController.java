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
import com.chary.spring.hibernate.entities.Shop;
import com.chary.spring.hibernate.service.ShopService;



@RestController
public class ShopController {
	@Autowired
	ShopService shopService;
	
	@PostMapping("/create")
	public Shop createShop(@RequestBody Shop shop) throws Exception
	{
		return shopService.saveShop(shop);
	}
    
	@GetMapping("/select")
	public List<Shop> getAllShops() throws Exception
	{
		return shopService.getShop();
	}
	
	@GetMapping("/select/{shopId}")
	public Optional<Shop> getShopById(@PathVariable int shopId)
	{
		return shopService.getShopById(shopId);
	}
    
	
	@DeleteMapping("/delete/{shopId}")
	public String deleteProduct(@PathVariable int shopId)
	{
		return shopService.deleteShop(shopId);
	}
    
	
	@PutMapping("/update")
	public Shop updateShop(@RequestBody Shop shop) throws Exception
	{
		return shopService.updateShop(shop);
	}

}


