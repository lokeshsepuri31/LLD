package com.example.lld.composite.example2;

public class Expression implements ArithmeticExpression {

	ArithmeticExpression leftExpression;
	ArithmeticExpression rightExpression;
	Operation operation;

	public Expression(ArithmeticExpression lefArithmeticExpression, ArithmeticExpression riArithmeticExpression, Operation operation) {
		this.leftExpression = lefArithmeticExpression;
		this.rightExpression = riArithmeticExpression;
		this.operation = operation;
	}

	@Override
	public int evaluate() {

		switch (operation) {
		case ADD:
			return leftExpression.evaluate() + rightExpression.evaluate();
		case SUBTRACT:
			return leftExpression.evaluate() - rightExpression.evaluate();
		case DIVIDE:
			return leftExpression.evaluate() / rightExpression.evaluate();
		case MULTIPLY:
			return leftExpression.evaluate() * rightExpression.evaluate();

		}

		return 0;
	}

}
