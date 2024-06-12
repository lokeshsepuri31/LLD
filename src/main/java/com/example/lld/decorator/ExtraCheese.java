package com.example.lld.decorator;

public class ExtraCheese implements ToppingDecorator {
	
	BasePizza basePizza;
	
	public ExtraCheese(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	public float cost() {
		return this.basePizza.cost() + 10;
	}

}
