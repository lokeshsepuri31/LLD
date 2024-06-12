package com.example.lld.command;

public class TurnOnACCommand implements ICommand {

	AirConditoner airConditoner;

	public TurnOnACCommand(AirConditoner airConditoner) {
		this.airConditoner = airConditoner;
	}

	@Override
	public void execute() {
		airConditoner.setOnAC(true);
	}

	@Override
	public void undo() {
		airConditoner.setOnAC(false);
	}

}
