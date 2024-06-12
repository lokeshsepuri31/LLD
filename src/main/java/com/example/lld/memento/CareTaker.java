package com.example.lld.memento;

public interface CareTaker {

	public void addMemento(Memento memento);
	public Memento undo();
}
