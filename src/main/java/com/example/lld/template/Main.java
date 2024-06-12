package com.example.lld.template;

public class Main {

	public static void main(String[] args) {
		PaymentFlow paymentFlow = new PaymentToFriend();
		paymentFlow.sendMoney();
		
		System.out.println("---------------------------------------------");
		
		PaymentFlow paymentFlow2 = new PaymentToMerchent();
		paymentFlow2.sendMoney();
	}
}
