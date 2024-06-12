package com.example.lld.visitor;

public class RoomMaintainanceVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom obj) {
		System.out.println("Maintainance is happening for SingleRoom");
	}

	@Override
	public void visit(DoubleRoom obj) {
		System.out.println("Maintainance is happening for DoubleRoom");		
	}

	@Override
	public void visit(DeluxRoom obj) {
		System.out.println("Maintainance is happening for DeluxRoom");		
	}

}
