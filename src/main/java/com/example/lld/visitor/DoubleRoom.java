package com.example.lld.visitor;

public class DoubleRoom implements RoomElement {

	public float roomPrice = 0;
	
	@Override
	public void accept(RoomVisitor visitor) {
		visitor.visit(this);		
	}

}
