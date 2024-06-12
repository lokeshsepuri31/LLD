package com.example.lld.interpreter;

public class BinaryNonTerminalExpression implements AbstractExpression {

	AbstractExpression leftExpression;
	AbstractExpression rightExpression;
	char operator;
	
	public BinaryNonTerminalExpression(AbstractExpression lefAbstractExpression, AbstractExpression  riAbstractExpression, char operator) {
		this.leftExpression = lefAbstractExpression;
		this.rightExpression = riAbstractExpression;
		this.operator = operator;
	}

	@Override
	public int interpret(Context context) {
		switch (operator) {
		case '*':
			return leftExpression.interpret(context) * rightExpression.interpret(context);
		case '+' :
			return leftExpression.interpret(context) + rightExpression.interpret(context);

		default:
			return 0;
		}
	}
	
	
	
}
