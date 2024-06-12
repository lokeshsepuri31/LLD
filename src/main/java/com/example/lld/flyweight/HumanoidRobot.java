package com.example.lld.flyweight;

/*
 * In this class only Intrinsic data(which are not changed) must be the local variables.
 * And Extrinsic data(which are frequently changed) must be in methods in this case they are in "display" method
 */
public class HumanoidRobot implements IRobot {

	String type;
	Image image;
	
	HumanoidRobot(String type, Image image) {
		this.type = type;
		this.image = image;
	}

	@Override
	public void display(int x, int y) {
		System.out.println(type + " is displayed in " + x +" and " +y + " cordinates");
	}
	
	
	
}
