package com.example.lld.bridge;

public class Human extends LivingThing {

	public Human(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
	}

	@Override
	public void breathe() {
		breatheImplementor.breatheProcess();
	}

}
