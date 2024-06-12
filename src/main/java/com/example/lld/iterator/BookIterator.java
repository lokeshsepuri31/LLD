package com.example.lld.iterator;

import java.util.Iterator;
import java.util.List;

public class BookIterator<T> implements Iterator<T> {

	List<T> bookList;
	private int index = 0;
	
	BookIterator(List<T> bookList) {
		this.bookList = bookList;
	}
	
	
	@Override
	public boolean hasNext() {
		return index < bookList.size();
	}

	@Override
	public T next() {
		if(this.hasNext()) {
			return bookList.get(index++);
		}
		return null;
	}

}
