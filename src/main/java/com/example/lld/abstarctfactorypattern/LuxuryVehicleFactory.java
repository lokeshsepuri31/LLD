package com.example.lld.abstarctfactorypattern;

public class LuxuryVehicleFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle(String vechicleName) {
		switch (vechicleName) {
		case "Luxury":
			return new LuxuryVehicle(vechicleName);
		case "Super Luxury": //For example there are different Luxury vechicle class like "vechicleName"
			return new LuxuryVehicle(vechicleName);
		}
		return null;
	}

}
