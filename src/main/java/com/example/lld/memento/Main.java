package com.example.lld.memento;

public class Main {

	public static void main(String[] args) {

		State state = new State();
		state.setHeight(2);
		state.setWidth(1);

		Originator originator = new ConfigurationOriginator();
		
		originator.setState(state);

		CareTaker careTaker = new ConfigurationCareTaker();

		careTaker.addMemento(originator.createMemento());

		State state1 = new State();
		state1.setHeight(10);
		state1.setWidth(20);
		
		originator.setState(state1);

		Memento undoMemento = careTaker.undo();
		originator.restoreMemento(undoMemento);
		State restoredState = originator.getState();

		System.out.println("Height of restored state is: " + restoredState.getHeight());
		System.out.println("Width of restored state is: " + restoredState.getWidth());
		

	}
}
