package com.example.lld.implement.vendingmachine;

import java.util.List;

public class DispenseState implements State {

	DispenseState(VendingMachine machine, int codeNumber) throws Exception {

		System.out.println("Currently vending machine is in Despense State.");
		dispenseProduct(machine, codeNumber);
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		throw new Exception("Insert coin button can not clicked in dispense state");
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		throw new Exception("Product selection button can not be clicked in despense state");
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		throw new Exception("Coin can't be inserted in dispense state");
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("Product can't be choose in dispense state");
	}

	@Override
	public int getChange(int returnChangeMoney) throws Exception {
		throw new Exception("Change can't be returned in despense state");
	}

	@Override
	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		System.out.println("Product has been dispensed");
		Item item = machine.getInventory().getItem(codeNumber);
		machine.getInventory().updateSoldOutItem(codeNumber);
		machine.setVendingMachineState(new IdleState(machine));
		return item;
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		throw new Exception("Refund can't be happen in dispense state");
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		throw new Exception("Inventory can't be updated in dispense state");
	}

}
