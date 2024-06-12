package com.example.lld.factorypattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("Circle");
		shape.draw();
	}
}
