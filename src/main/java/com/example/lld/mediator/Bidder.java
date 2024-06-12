package com.example.lld.mediator;

public class Bidder implements Colleague{
	
	Mediator auctionMediator;
	String name;
	
	Bidder(String name, Mediator mediator) {
		this.name = name;
		this.auctionMediator = mediator;
		this.auctionMediator.addBidder(this);
	}

	@Override
	public void placeBid(int amount) {
		auctionMediator.placeBid(this, amount);
	}

	@Override
	public void recieveNotification(int bidAmount) {
		System.out.println("Bidder: " + name + " got the notification that someone has put bid of: "+bidAmount);
	}

	@Override
	public String getName() {
		return this.name;
	}

}
