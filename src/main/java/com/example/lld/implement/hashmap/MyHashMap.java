package com.example.lld.implement.hashmap;

public class MyHashMap<K, V> {

	private static final int MAX_CAPACITY = 1 << 30;

	private static final int INITIAL_CAPACITY = 1 << 4; // aka 16

	private static final float DEFAULT_LOAD_FACTOR = 0.75f;

	private Entry<K, V>[] hashTable;

	MyHashMap() {
		this.hashTable = new Entry[INITIAL_CAPACITY];
	}

	MyHashMap(int initialCapacity) {
		int tableSize = tableSizeFor(initialCapacity);
		this.hashTable = new Entry[tableSize];
	}

	private static final int tableSizeFor(int cap) {
		int n = cap - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return (n < 0) ? 1 : (n >= MAX_CAPACITY) ? MAX_CAPACITY : n + 1;
	}
	
	
	public void put(K key, V value) {
		int hashCode = key.hashCode() % hashTable.length;
		Entry<K, V> node = hashTable[hashCode];
		
		if(node == null) {
			Entry<K, V> newNode = new Entry<K, V>(key, value, null);
			hashTable[hashCode] = newNode;
		} else {
			Entry previousNode = node;
			while(node != null) {
				if(node.key == key) {
					node.value = value;
					return;
				}
				previousNode = node;
				node = node.next;
			}
			Entry newNode = new Entry<K, V>(key, value, null);
			previousNode.next = newNode;
		}
	}
	
	public V get(K key) {
		int hashCode = key.hashCode() % hashTable.length;
		
		Entry node = hashTable[hashCode];
		
		while(node != null) {
			if(node.key.equals(key)) {
				return (V) node.value;
			}
			node = node.next;
		}
		return null;
	}

	static class Entry<K, V> {

		public K key;
		public V value;
		public Entry<K, V> next;

		Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
}
