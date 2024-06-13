package com.example.lld.state;

public class Main {

	public static void main(String[] args) {
		VendingMachineContext vendingMachine = new VendingMachineContext();
		
		vendingMachine.setState(new ReadyState());
		vendingMachine.request();
		
		vendingMachine.setState(new PaymentState());
		vendingMachine.request();
		
		vendingMachine.setState(new ProductSelectedState());
		vendingMachine.request();
	}
}
