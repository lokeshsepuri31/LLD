package com.example.lld.adapter;

public class Main {

	public static void main(String[] args) {

		WeightMachineAdapter weightMachineAdapter = new WeightMachineForAdults(new WeightMachineForBabies());

		System.out.println(weightMachineAdapter.getWeightInKGs()+ "KGs");

	}

}
