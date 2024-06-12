package com.example.lld.builder;

public class GamingComputerBuilder implements Builder {

	Computer computer;

	public GamingComputerBuilder() {
		computer = new Computer();
	}

	@Override
	public Builder buildCPU() {
		computer.setCpu("Strong CPU");
		return this;
	}

	@Override
	public Builder buildRAM() {
		computer.setRam("Strong RAM");
		return this;
	}

	@Override
	public Builder buildStorage() {
		computer.setStorage("Huge storage");
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
