package com.example.lld.template;

public class PaymentToFriend extends PaymentFlow {
	
	@Override
	public void validateRequest() {
		System.out.println("Validating payment to friend request.");
	}

	@Override
	public void debitAmount() {
		System.out.println("Amount got debited from payment to friend.");
	}

	@Override
	public void calculateFees() {
		System.out.println("Calculating the money i.e sent to friend.");
	}

	@Override
	public void creditAmount() {
		System.out.println("Amount got credited from friend.");
	}

}
