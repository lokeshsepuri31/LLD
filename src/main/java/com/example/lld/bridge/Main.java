package com.example.lld.bridge;

public class Main {

	public static void main(String[] args) {
		LivingThing fish = new Fish(new WaterBreatheImplementor());
		
		fish.breathe();
	}
}
