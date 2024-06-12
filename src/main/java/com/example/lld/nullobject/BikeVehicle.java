package com.example.lld.nullobject;

public class BikeVehicle implements Vehicle {

	@Override
	public int getTankCapacity() {
		return 5;
	}

	@Override
	public int getTopSpeed() {
		return 100;
	}

}
