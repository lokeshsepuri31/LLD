package com.example.lld.implement.hashmap;

public class Main {

	public static void main(String[] args) {
		MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
		
		map.put(1, "Hello");
		map.put(2, "World");
		
		System.out.println(map.get(1));
		
	}
}
