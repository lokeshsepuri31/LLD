package com.example.lld.implement.vendingmachine;

public class ItemShelf {

	int codeNumber;
	Item item;
	boolean soldOut;

	public int getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(int codeNumber) {
		this.codeNumber = codeNumber;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}

}
