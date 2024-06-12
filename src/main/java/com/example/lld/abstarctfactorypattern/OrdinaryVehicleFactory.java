package com.example.lld.abstarctfactorypattern;

public class OrdinaryVehicleFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String vehicleName) {
		switch (vehicleName) {
		case "Ordinary":
			return new OrdinaryVehicle(vehicleName);
		case "Super Ordinary": // For example there are different vehicle of "vehcileName"
			return new OrdinaryVehicle(vehicleName);
		}
		return null;
	}

}
