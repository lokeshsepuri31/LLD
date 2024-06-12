package com.example.lld.abstarctfactorypattern;

public class Main {

	public static void main(String[] args) {
		VehicleFactoryImpl vehicleFactoryImpl = new VehicleFactoryImpl();
		VehicleFactory luxuryVehicleFactory = vehicleFactoryImpl.getVehicleFactory("Luxury Vehicle Factory");
		Vehicle luxuryVehicle = luxuryVehicleFactory.getVehicle("Super Luxury");
		luxuryVehicle.cost();
		
		VehicleFactory ordinaryVehicleFactory = vehicleFactoryImpl.getVehicleFactory("Ordinary Vehicle Factory");
		Vehicle ordinaryVehicle = ordinaryVehicleFactory.getVehicle("Super Ordinary");
		ordinaryVehicle.cost();
	}
}
