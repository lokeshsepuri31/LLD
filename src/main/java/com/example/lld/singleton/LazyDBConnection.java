package com.example.lld.singleton;

/*
 * This type of SPD will create multiple instance when two threads are call getInstance method at a time.
 */

public class LazyDBConnection {
	
	private static LazyDBConnection lazyDBConnection;
	
	private LazyDBConnection() {}
	
	public static LazyDBConnection getInstance() {
		if(lazyDBConnection == null) {
			lazyDBConnection = new LazyDBConnection();
		}
		return lazyDBConnection;
	}
	
}
