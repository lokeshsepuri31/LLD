package com.example.lld.implement.shoppingcart;

public class Main {

	public static void main(String[] args) {

		Product item = new Item("Fan", 2000, ProductType.ELECTRONICS_GOODS);
		Product item1 = new Item("Sofa", 5000.25f, ProductType.FURNITURE_GOODS);

		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.addToCart(item1);
		shoppingCart.addToCart(item);

		System.out.println("Your total cost is: " + shoppingCart.getTotalPrice());

	}
}
