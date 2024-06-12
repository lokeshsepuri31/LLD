package com.example.lld.decorator;

public class ExtraMushroom implements ToppingDecorator {

	BasePizza basePizza;
	
	public ExtraMushroom(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	public float cost() {
		return this.basePizza.cost() + 50;
	}
}
