package com.example.lld.implement.shoppingcart;

public abstract class Product {
	
	String name;
	double originalPrice;
	ProductType type;
	
	Product(String name, double originalPrice, ProductType type) {
		this.name = name;
		this.originalPrice = originalPrice;
		this.type = type;
	}
	
	
	Product() {}

	public abstract float getPrice();
	
	public ProductType getType() {
		return type;
	}
	
}
