package com.example.lld.strategy.vehicles;

import com.example.lld.strategy.Vehicle;

public class VehicleImp {

	Vehicle vehicle;
	
	public VehicleImp(Vehicle obj) {
		this.vehicle = obj;
	}
	
	public void specs() {
		vehicle.specs();
	}
}
