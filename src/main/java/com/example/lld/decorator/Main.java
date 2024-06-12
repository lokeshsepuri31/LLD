package com.example.lld.decorator;

public class Main {

	public static void main(String[] args) {

		ToppingDecorator toppingDecoratorCheese = new ExtraCheese(new ExtraMushroom(new VegDelight()));

		System.out.println(toppingDecoratorCheese.cost());

	}
}
