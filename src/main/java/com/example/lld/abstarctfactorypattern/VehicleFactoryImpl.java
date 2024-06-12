package com.example.lld.abstarctfactorypattern;

public class VehicleFactoryImpl {

	
	public VehicleFactory getVehicleFactory(String vehicleFactoryName) {
		
		switch (vehicleFactoryName) {
		case "Luxury Vehicle Factory":
			return new LuxuryVehicleFactory();
		case "Ordinary Vehicle Factory":
			return new OrdinaryVehicleFactory();

		default:
			return null;
		}
	}
	
}
