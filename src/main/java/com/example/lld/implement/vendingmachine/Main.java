package com.example.lld.implement.vendingmachine;

public class Main {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();

		try {

			System.out.println("|");
			System.out.println("Filling up inventory");
			System.out.println("|");

			fillUpInventory(vendingMachine);
			displayInventory(vendingMachine);

			System.out.println("|");
			System.out.println("Clicking on insert coin button");
			System.out.println("|");

			State vendingState = vendingMachine.getVendingMachineState();
			vendingState.clickOnInsertCoinButton(vendingMachine);

			vendingState = vendingMachine.getVendingMachineState();
			vendingState.insertCoin(vendingMachine, Coin.NICKEL);
			vendingState.insertCoin(vendingMachine, Coin.QUARTER);

			System.out.println("|");
			System.out.println("Clicking on product selection button");
			System.out.println("|");

			vendingState.clickOnStartProductSelectionButton(vendingMachine);

			vendingState = vendingMachine.getVendingMachineState();
			vendingState.chooseProduct(vendingMachine, 102);

			displayInventory(vendingMachine);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void displayInventory(VendingMachine vendingMachine) {
		ItemShelf[] slots = vendingMachine.getInventory().getInventory();
		for (int i = 0; i < slots.length; i++) {
			System.out.println(
					"CodeNumber: " + slots[i].getCodeNumber() + " Item: " + slots[i].getItem().getItemType().name()
							+ " Price: " + slots[i].getItem().getPrice() + " isAvailable: " + !slots[i].isSoldOut());
		}
	}

	private static void fillUpInventory(VendingMachine vendingMachine) {
		ItemShelf[] slots = vendingMachine.getInventory().getInventory();
		for (int i = 0; i < slots.length; i++) {
			Item newItem = new Item();
			if (i >= 0 && i < 3) {
				newItem.setItemType(ItemType.COKE);
				newItem.setPrice(12);
			} else if (i >= 3 && i < 5) {
				newItem.setItemType(ItemType.PEPSI);
				newItem.setPrice(10);
			} else if (i >= 5 && i < 7) {
				newItem.setItemType(ItemType.JUICE);
				newItem.setPrice(9);
			} else if (i >= 7 && i < 10) {
				newItem.setItemType(ItemType.SODA);
				newItem.setPrice(7);
			}

			slots[i].setItem(newItem);
			slots[i].setSoldOut(false);
		}
	}
}
