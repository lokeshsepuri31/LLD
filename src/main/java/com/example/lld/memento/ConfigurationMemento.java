package com.example.lld.memento;

public class ConfigurationMemento implements Memento {
	
	State state;
	
	public ConfigurationMemento(State state) {
		this.state = state;
	}

	@Override
	public void setState(State state) {
		this.state = state;
	}

	@Override
	public State getState() {
		return this.state;
	}

}
