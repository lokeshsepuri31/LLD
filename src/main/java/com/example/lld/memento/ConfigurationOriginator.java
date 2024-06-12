package com.example.lld.memento;

public class ConfigurationOriginator implements Originator {

	State state;
	
	@Override
	public Memento createMemento() {
		return new ConfigurationMemento(this.state);
	}

	@Override
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

	@Override
	public State getState() {
		return this.state;
	}
	
	@Override
	public void setState(State state) {
		this.state = state;
	}
}
