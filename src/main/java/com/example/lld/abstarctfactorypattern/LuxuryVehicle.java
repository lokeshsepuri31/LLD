package com.example.lld.abstarctfactorypattern;

public class LuxuryVehicle implements Vehicle{

	String vehicleName = "";

	public LuxuryVehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	@Override
	public void cost() {
		System.out.println("This is a " + vehicleName);
		System.out.println("Expensive");
	}

}
