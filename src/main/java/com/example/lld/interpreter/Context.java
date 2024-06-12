package com.example.lld.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {

	private Map<String, Integer> map = new HashMap<String, Integer>();
	
	public void add(String key, Integer value) {
		map.put(key, value);
	}
	
	public Integer get(String key) {
		return map.get(key);
	}
	
}
