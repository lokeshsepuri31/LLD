package com.example.lld.memento;

public interface Originator {

	public Memento createMemento();
	public void restoreMemento(Memento memento);
	public State getState();
	public void setState(State state);
}
