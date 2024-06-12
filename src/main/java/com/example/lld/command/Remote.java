package com.example.lld.command;

import java.util.Stack;

/*
 * This class is also called as invoker in Design pattern perspective
 */
public class Remote {

	Stack<ICommand> icommandStack = new Stack<ICommand>();
	ICommand icommand;

	public ICommand getIcommand() {
		return icommand;
	}

	public void setIcommand(ICommand icommand) {
		this.icommand = icommand;
	}

	public void pressButton() {
		icommand.execute();
		icommandStack.add(icommand);
	}

	public void undo() {
		if (!icommandStack.isEmpty()) {
			ICommand previousCommand = icommandStack.pop();
			previousCommand.undo();
		}
	}

}
