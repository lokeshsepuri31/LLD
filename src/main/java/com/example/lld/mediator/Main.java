package com.example.lld.mediator;

public class Main {

	public static void main(String[] args) {
		
		AuctionMediator auctionMediator = new AuctionMediator();
		
		Colleague colleague1 = new Bidder("Ajay", auctionMediator);
		Colleague colleague2 = new Bidder("Abhsihek", auctionMediator);
		
		colleague1.placeBid(2000);
		colleague2.placeBid(3000);
		colleague1.placeBid(10000);
		
		
	}
}
