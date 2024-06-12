package com.example.lld.implement.vendingmachine;

import java.util.List;

public class SelectionState implements State {

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		// 1. get item of this codeNumber
		Item item = machine.getInventory().getItem(codeNumber);

		// 2. total amount paid by User
		int paidByUser = 0;
		for (Coin coin : machine.getCoinList()) {
			paidByUser += coin.value;
		}

		// 3. compare product price and amount paid by user
		if (paidByUser < item.getPrice()) {
			System.out.println("Insufficient amount, Product you selected is for price: " + item.getPrice() + "and you paid: " + paidByUser);
			refundFullMoney(machine);
			throw new Exception("Insufficent Money");
		} else if (paidByUser >= item.getPrice()) {
			if (paidByUser > item.getPrice()) {
				getChange(paidByUser - item.getPrice());
			}
			machine.setVendingMachineState(new DispenseState(machine, codeNumber));
		}
	}

	@Override
	public int getChange(int returnChangeMoney) throws Exception {
		System.out.println("Returned the change in the coin dispense tray: " + returnChangeMoney);
		return returnChangeMoney;
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("Product can't be dispensed in selection state");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {

		System.out.println("Return full amount back in coin dispense tray");
		machine.setVendingMachineState(new IdleState());
		return machine.getCoinList();

	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		throw new Exception("Inventory can't be updated in selection state");
	}

}
