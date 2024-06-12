package com.example.lld.mediator;

public interface Mediator {

	public void placeBid(Colleague colleague, int bidAmount);
	public void addBidder(Colleague bidder);
	
}
