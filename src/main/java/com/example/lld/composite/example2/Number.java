package com.example.lld.composite.example2;

public class Number implements ArithmeticExpression {
	
	int value;
	
	Number(int value) {
		this.value = value;
	}

	@Override
	public int evaluate() {
		return this.value;
	}

}
