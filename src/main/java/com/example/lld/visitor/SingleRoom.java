package com.example.lld.visitor;

public class SingleRoom implements RoomElement {

	public float roomPrice = 0;
	
	@Override
	public void accept(RoomVisitor visitor) {
		visitor.visit(this);
	}

}
