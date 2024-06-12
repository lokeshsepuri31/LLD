package com.example.lld.flyweight;

public class Main {

	public static void main(String[] args) {
		IRobot human = RobotFactory.createInstance("Humanoid");
		
		human.display(0, 0);
		
		IRobot dog = RobotFactory.createInstance("Dog");
		
		dog.display(10, 0);
		
		IRobot human1 = RobotFactory.createInstance("Humanoid");
		human1.display(20, 5);
		
		System.out.println(human.hashCode() == human1.hashCode());
	}
}
