package com.chary.spring.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class Shop {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shop_id")   
	private int shopId;
	@Column(name="shop_name" ,length=50) 
	private String shopName;
	@Column(name="shop_description",length=50) 
	private String shopDescription;
	@Column(name="shop_typeid",length=50) 
	private int shopTypeId;
	@Column(name="address",length=50) 
	private String address;
	@Column(name="city",length=50) 
	private String city;
	@Column(name="state",length=50) 
	private String state;
	@Column(name="country",length=50) 
	private String country;
	@Column(name="zipcode",length=50) 
	private int zipcode;
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopDescription() {
		return shopDescription;
	}
	public void setShopDescription(String shopDescription) {
		this.shopDescription = shopDescription;
	}
	public int getShopTypeId() {
		return shopTypeId;
	}
	public void setShopTypeId(int shopTypeId) {
		this.shopTypeId = shopTypeId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
}
