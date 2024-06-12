package com.example.lld.implement.vendingmachine;

public class Inventory {

	ItemShelf[] inventory = null;

	public Inventory(int itemCount) {
		inventory = new ItemShelf[itemCount];
		initialEmptyInventory();
	}

	public ItemShelf[] getInventory() {
		return inventory;
	}

	public void setInventory(ItemShelf[] inventory) {
		this.inventory = inventory;
	}

	public void initialEmptyInventory() {
		int startCode = 101;
		for (int i = 0; i < inventory.length; i++) {
			ItemShelf space = new ItemShelf();
			space.setCodeNumber(startCode);
			space.setSoldOut(true);
			inventory[i] = space;
			startCode++;
		}
	}

	public void addItem(Item item, int codeNumber) throws Exception {
		for (ItemShelf itemShelf : inventory) {
			if (itemShelf.getCodeNumber() == codeNumber) {
				if (itemShelf.isSoldOut()) {
					itemShelf.setItem(item);
					itemShelf.setSoldOut(false);
				} else {
					throw new Exception("Already item is present, you can not add item here.");
				}
			}
		}
	}

	public Item getItem(int codeNumber) throws Exception {

		for (ItemShelf itemShelf : inventory) {
			if (itemShelf.getCodeNumber() == codeNumber) {
				if (!itemShelf.isSoldOut()) {
					return itemShelf.getItem();
				}
			}
		}
		return null;
	}

	public void updateSoldOutItem(int codeNumber) {

		for (ItemShelf itemShelf : inventory) {
			if (itemShelf.getCodeNumber() == codeNumber) {
				itemShelf.setSoldOut(true);
			}
		}
	}

}
