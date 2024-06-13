package com.example.lld.interpreter;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.add("a", 2);
		context.add("b", 3);
		context.add("c", 4);
		context.add("d", 5);
		
		AbstractExpression abstractExpression = new BinaryNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"), '+');
		System.out.println(abstractExpression.interpret(context));
	}
}
