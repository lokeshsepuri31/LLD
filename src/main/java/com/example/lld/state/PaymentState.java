package com.example.lld.state;

public class PaymentState implements VendingMachineState {

	@Override
	public void handleRequest() {
		System.out.println("Vending machine is in payment state");
	}

}
