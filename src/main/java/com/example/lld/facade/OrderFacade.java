package com.example.lld.facade;

public class OrderFacade {

	private Payment payment;
	private ProductDAO productDao;
	
	public OrderFacade() {
		payment = new Payment();
		productDao = new ProductDAO();
	}
	
	public void createOrder() {
		Product product;
		if(payment.isPaymentSuccessful()) {
			product = productDao.createProduct();
		}
		System.out.println("New order got created");
	}
}
