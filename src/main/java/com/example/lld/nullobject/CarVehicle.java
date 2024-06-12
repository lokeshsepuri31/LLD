package com.example.lld.nullobject;

public class CarVehicle implements Vehicle {

	@Override
	public int getTankCapacity() {
		return 10;
	}

	@Override
	public int getTopSpeed() {
		return 240;
	}

}
