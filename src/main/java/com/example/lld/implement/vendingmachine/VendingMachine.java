package com.example.lld.implement.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

	State state;

	Inventory inventory;

	List<Coin> coinList;

	public VendingMachine() {

		this.state = new IdleState();
		inventory = new Inventory(10);
		coinList = new ArrayList<Coin>();

	}

	public State getVendingMachineState() {
		return state;
	}

	public List<Coin> getCoinList() {
		return coinList;
	}

	public void setCoinList(List<Coin> coinList) {
		this.coinList = coinList;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public void setVendingMachineState(State state) {
		this.state = state;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

}
