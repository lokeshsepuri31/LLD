package com.example.lld.iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Library<Book> library = new Library<Book>();
		library.addBook(new Book(10, "Harry Potter"));
		library.addBook(new Book(20, "Science"));
		library.addBook(new Book(30, "Maths"));

		Iterator<Book> iterator = library.createIterator();

		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println("Name of book is " + book.getBookName() + " and cost is " + book.getPrice());
		}

	}
}
