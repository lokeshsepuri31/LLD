package com.example.lld.nullobject;

public class NullVehicle implements Vehicle{

	@Override
	public int getTankCapacity() {
		return 0;
	}

	@Override
	public int getTopSpeed() {
		return 0;
	}

}
