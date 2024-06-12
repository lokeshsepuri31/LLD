package com.example.lld.visitor;

public class RoomPricingVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom obj) {
		obj.roomPrice = 2000;
		System.out.println("Here is the price for SingleRoom: " + obj.roomPrice);
	}

	@Override
	public void visit(DoubleRoom obj) {
		obj.roomPrice = 2500;
		System.out.println("Here is the price for DoubleRoom: " + obj.roomPrice);		
	}

	@Override
	public void visit(DeluxRoom obj) {
		obj.roomPrice = 3000;
		System.out.println("Here is the price for DeluxRoom: " + obj.roomPrice);		
	}

}
