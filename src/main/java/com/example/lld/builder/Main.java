package com.example.lld.builder;

public class Main {

	public static void main(String[] args) {
		ComputerDirector director = new ComputerDirector(new NormalComputerBuilder());
		
		director.construct().displayInfo();
	}
}
