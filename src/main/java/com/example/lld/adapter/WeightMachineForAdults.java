package com.example.lld.adapter;

public class WeightMachineForAdults implements WeightMachineAdapter {

	WeightMachine weightMachine;

	public WeightMachineForAdults(WeightMachine weightMachine) {
		this.weightMachine = weightMachine;
	}

	@Override
	public double getWeightInKGs() {
		double weight = weightMachine.getWeightInPounds();

		weight *= 0.45;

		return weight;
	}

}
