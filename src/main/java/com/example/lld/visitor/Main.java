package com.example.lld.visitor;

public class Main {

	public static void main(String[] args) {
		
		RoomElement singleRoom = new SingleRoom();
		RoomElement doubleRoom = new DoubleRoom();
		RoomElement deluxRoom = new DeluxRoom();
		
		RoomVisitor roomPricingVisitor = new RoomPricingVisitor();
		
		singleRoom.accept(roomPricingVisitor);
		doubleRoom.accept(roomPricingVisitor);
		deluxRoom.accept(roomPricingVisitor);
		
		RoomVisitor roomMaintainanceVisitor = new RoomMaintainanceVisitor();
		
		singleRoom.accept(roomMaintainanceVisitor);
		
	}
}
