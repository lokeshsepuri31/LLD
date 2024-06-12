package com.example.lld.iterator;

public class Book {

	private double price;
	private String bookName;
	
	Book(int price, String bookName) {
		this.price = price;
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
