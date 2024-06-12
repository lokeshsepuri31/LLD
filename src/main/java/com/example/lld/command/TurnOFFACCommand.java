package com.example.lld.command;

public class TurnOFFACCommand implements ICommand {

	AirConditoner airConditoner;

	public TurnOFFACCommand(AirConditoner airConditoner) {
		this.airConditoner = airConditoner;
	}

	@Override
	public void execute() {
		airConditoner.setOnAC(false);

	}

	@Override
	public void undo() {
		airConditoner.setOnAC(true);
	}
}
