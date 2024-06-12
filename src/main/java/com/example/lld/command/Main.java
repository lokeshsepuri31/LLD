package com.example.lld.command;

public class Main {

	public static void main(String[] args) {
		Remote remote = new Remote();

		AirConditoner airConditoner = new AirConditoner();

		remote.setIcommand(new TurnOnACCommand(airConditoner));
		remote.pressButton();
		System.out.println(airConditoner.isOnAC());
		remote.undo();
		System.out.println("After undo: " + airConditoner.isOnAC());
	}
}
