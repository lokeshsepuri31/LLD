package com.example.lld.interpreter;

public class NumberTerminalExpression implements AbstractExpression {
	
	String key;
	
	public NumberTerminalExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpret(Context context) {
		return context.get(this.key);
	}

}
