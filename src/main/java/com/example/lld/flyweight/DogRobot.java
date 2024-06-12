package com.example.lld.flyweight;

public class DogRobot implements IRobot {

	String type;
	Image image;

	public DogRobot(String type, Image image) {
		this.image = image;
		this.type = type;
	}

	@Override
	public void display(int x, int y) {
		System.out.println(this.type + " is displayed in " + x + " and " + y + " cordinates.");
	}
}
