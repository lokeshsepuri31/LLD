package com.example.lld.bridge;

public class WaterBreatheImplementor implements BreatheImplementor {

	@Override
	public void breatheProcess() {
		System.out.println("-------- Water Breathing Living Thing --------");
		System.out.println("Breathe through Gills");
		System.out.println("Inhale oxygen from water and exhales CO2");
	}

}
