package com.example.lld.memento;

import java.util.Stack;

public class ConfigurationCareTaker implements CareTaker {

	Stack<Memento> mementoList = new Stack<Memento>();

	@Override
	public void addMemento(Memento memento) {
		mementoList.add(memento);
	}

	@Override
	public Memento undo() {
		return mementoList.pop();
	}

}
