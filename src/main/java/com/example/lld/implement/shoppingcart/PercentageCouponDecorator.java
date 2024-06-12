package com.example.lld.implement.shoppingcart;

public class PercentageCouponDecorator extends CouponDecorator {

	Product product;
	int percentage;

	public PercentageCouponDecorator(Product product, int percentage) {
		this.product = product;
		this.percentage = percentage;
	}

	@Override
	public float getPrice() {
		float price = this.product.getPrice();
		return price - (price * (percentage / 100f));
	}

}
