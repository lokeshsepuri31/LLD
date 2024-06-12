package com.example.lld.implement.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

	IdleState() {
		System.out.println("Currently vending machine is in idle state");
	}

	IdleState(VendingMachine machine) {
		System.out.println("Currently vending machine is in idle state");
		machine.setCoinList(new ArrayList<>());
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		machine.setVendingMachineState(new HasMoneyState());
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		throw new Exception("First you need to click on insert coin button");
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		throw new Exception("You can't insert coin in idle state");
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("You can't choose product in idle state");
	}

	@Override
	public int getChange(int returnChangeMoney) throws Exception {
		throw new Exception("You can get change in idle state");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("You can't get the product in idle state");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		throw new Exception("You can't get the refund in idle state");
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		machine.getInventory().addItem(item, codeNumber);
	}

}
