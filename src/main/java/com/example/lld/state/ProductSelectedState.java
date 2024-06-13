package com.example.lld.state;

public class ProductSelectedState implements VendingMachineState {

	@Override
	public void handleRequest() {
		System.out.println("Vending machine is in ProductSelectedState");
	}

}
