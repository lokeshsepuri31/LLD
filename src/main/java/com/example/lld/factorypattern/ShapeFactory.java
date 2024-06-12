package com.example.lld.factorypattern;

public class ShapeFactory {
	
	public Shape getShape(String shape) {
		switch (shape) {
		case "Square":
			return new Square();
		case "Circle":
			return new Circle();
		case "Rectangle":
			return new Rectangle();
		default:
			return null;
		}
	}

}
