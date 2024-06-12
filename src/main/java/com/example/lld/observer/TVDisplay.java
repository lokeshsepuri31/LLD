package com.example.lld.observer;

public class TVDisplay implements Observer{

	private String weather;
	
	@Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}

	private void display() {
		System.out.println("Phone Display: Weather updated - " + weather);
	}
}