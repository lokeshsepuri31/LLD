package com.example.lld.template;

public class PaymentToMerchent extends PaymentFlow {

	@Override
	public void validateRequest() {
		System.out.println("Validating payment to merchent request.");
	}

	@Override
	public void debitAmount() {
		System.out.println("Amount got debited from payment to merchent.");
		
	}

	@Override
	public void calculateFees() {
		System.out.println("Calculating the money i.e sent to merchent. 2% tax got deducted.");
		
	}

	@Override
	public void creditAmount() {
		System.out.println("Amount got credited from payment to merchent.");
		
	}

}
