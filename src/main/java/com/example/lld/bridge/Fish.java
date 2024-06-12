package com.example.lld.bridge;

public class Fish extends LivingThing {

	public Fish(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
	}

	@Override
	public void breathe() {
		breatheImplementor.breatheProcess();
	}

}
