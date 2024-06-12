package com.example.lld.implement.shoppingcart;

public class Item extends Product {

	String name;
	float price;
	ProductType type;
	
	Item(String name, float price, ProductType type) {
		super(name, price, type);
		this.name = name;
		this.price = price;
		this.type = type;
	}

	@Override
	public float getPrice() {
		return price;
	}

}
