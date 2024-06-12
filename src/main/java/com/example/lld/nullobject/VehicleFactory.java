package com.example.lld.nullobject;

public class VehicleFactory {

	public Vehicle getVehicle(String vehicleType) {

		if ("Car".equals(vehicleType))
			return new CarVehicle();
		else if ("Bike".equals(vehicleType))
			return new BikeVehicle();
		else
			return new NullVehicle();
	}
}
