package com.example.lld.implement.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {

	ProductType type;
	int percentage;
	Product product;
	static List<ProductType> productTypeList = new ArrayList<ProductType>();

	static {
		productTypeList.add(ProductType.ELECTRONICS_GOODS);
	}

	public TypeCouponDecorator(Product product, int percentage, ProductType type) {
		this.percentage = percentage;
		this.type = type;
		this.product = product;
	}

	@Override
	public float getPrice() {

		float price = product.getPrice();

		if (productTypeList.contains(type)) {
			return price - (price * (percentage / 100f));
		}

		return price;
	}

}
