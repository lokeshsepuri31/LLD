package com.example.lld.bridge;

public class LandBreatheImplementor implements BreatheImplementor{

	@Override
	public void breatheProcess() {
		System.out.println("---------- Land Breathing Living Thing ----------");
		System.out.println("Breath through Nose");
		System.out.println("Inhales oxygen from air and exhales CO2");
	}

}
