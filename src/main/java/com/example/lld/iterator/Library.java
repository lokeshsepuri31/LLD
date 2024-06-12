package com.example.lld.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library<T> {

	List<T> objectList;
	
	public Library() {
		this.objectList = new ArrayList<T>();
	}
	
	public void addBook(T object) {
		objectList.add(object);
	}
	
	public Iterator<T> createIterator() {
		return new BookIterator<T>(this.objectList);
	}
	
}
