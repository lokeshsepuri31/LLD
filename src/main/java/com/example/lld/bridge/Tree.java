package com.example.lld.bridge;

public class Tree extends LivingThing {

	public Tree(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
	}

	@Override
	public void breathe() {
		breatheImplementor.breatheProcess();
	}

}
