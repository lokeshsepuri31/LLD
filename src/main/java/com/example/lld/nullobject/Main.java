package com.example.lld.nullobject;

public class Main {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle vehicle = vehicleFactory.getVehicle(null);
		
		System.out.println("Top Speed of the vehicle is: " + vehicle.getTopSpeed() + "KMPH");
		System.out.println("Tank capacity of the vehicle is: " + vehicle.getTankCapacity() + "L");
	}
}
