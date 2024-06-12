package com.example.lld.mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
	
	List<Colleague> colleagues = new ArrayList<Colleague>();

	@Override
	public void placeBid(Colleague colleague, int bidAmount) {
		for(Colleague colleague1 : colleagues) {
			if(!colleague.getName().equals(colleague1.getName())) {
				colleague1.recieveNotification(bidAmount);
			}
		}
	}

	@Override
	public void addBidder(Colleague bidder) {
		this.colleagues.add(bidder);
	}

}
