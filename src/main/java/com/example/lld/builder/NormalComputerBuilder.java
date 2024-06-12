package com.example.lld.builder;

public class NormalComputerBuilder implements Builder {
	
	Computer computer;
	
	public NormalComputerBuilder() {
		computer = new Computer();
	}

	@Override
	public Builder buildCPU() {
		computer.setCpu("Normal CPU");
		return this;
	}

	@Override
	public Builder buildRAM() {
		computer.setRam("Normal RAM");
		return this;
	}

	@Override
	public Builder buildStorage() {
		computer.setStorage("Less Storage");
		return this;
	}

	@Override
	public Computer getResult() {
		return this.computer;
	}

	@Override
	public void displayInfo() {
		System.out.println(
				"CPU: " + computer.getCpu() + " RAM: " + computer.getRam() + " Storage: " + computer.getStorage());
	}
	
}
