package com.example.lld.builder;

public interface Builder {

	public Builder buildCPU();
	public Builder buildRAM();
	public Builder buildStorage();
	public Computer getResult();
	public void displayInfo();
}
