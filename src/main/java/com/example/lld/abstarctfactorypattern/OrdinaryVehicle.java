package com.example.lld.abstarctfactorypattern;

public class OrdinaryVehicle implements Vehicle {

	String vehicleName = "";
	
	public OrdinaryVehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	@Override
	public void cost() {
		System.out.println("This is a " + vehicleName);
		System.out.println("Average");
	}

}
