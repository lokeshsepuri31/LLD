package com.example.lld.implement.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Product> productList;

	public ShoppingCart() {
		this.productList = new ArrayList<Product>();
	}

	public void addToCart(Product product) {
		Product productWithEligibleDiscount = new TypeCouponDecorator(new PercentageCouponDecorator(product, 10), 3,
				product.getType());
		productList.add(productWithEligibleDiscount);
	}

	public float getTotalPrice() {
		float totalPrice = 0;
		for (Product product : productList) {
			totalPrice += product.getPrice();
		}

		return totalPrice;
	}

}
