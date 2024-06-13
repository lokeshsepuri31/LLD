package com.example.lld.state;

public class ReadyState implements VendingMachineState {

	
	@Override
	public void handleRequest() {
		System.out.println("Vending machine is in ready state");
	}

}
