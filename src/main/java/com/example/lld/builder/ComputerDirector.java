package com.example.lld.builder;

public class ComputerDirector {
	
	Builder builder;
	
	public ComputerDirector(Builder builder) {
		this.builder = builder;
	}

	public Builder construct() {
		builder.buildCPU().buildRAM().buildStorage();
		return builder;
	}
}
