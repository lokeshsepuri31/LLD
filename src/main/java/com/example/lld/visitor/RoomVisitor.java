package com.example.lld.visitor;

public interface RoomVisitor {

	public void visit(SingleRoom obj);
	public void visit(DoubleRoom obj);
	public void visit(DeluxRoom obj);
}
