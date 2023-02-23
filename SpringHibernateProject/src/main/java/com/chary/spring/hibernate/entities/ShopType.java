package com.chary.spring.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shoptype")
public class ShopType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="shoptype_id")   
	private int shopTypeId;
	@Column(name="shoptype_name" ,length=50) 
	private String shoptTypeName;
	@Column(name="shoptype_description",length=50) 
	private String shoptypeDescription;
	public int getShopTypeId() {
		return shopTypeId;
	}
	public void setShopTypeId(int shopTypeId) {
		this.shopTypeId = shopTypeId;
	}
	public String getShoptTypeName() {
		return shoptTypeName;
	}
	public void setShoptTypeName(String shoptTypeName) {
		this.shoptTypeName = shoptTypeName;
	}
	public String getShoptypeDescription() {
		return shoptypeDescription;
	}
	public void setShoptypeDescription(String shoptypeDescription) {
		this.shoptypeDescription = shoptypeDescription;
	}
    
	
}
