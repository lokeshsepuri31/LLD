package com.example.lld.singleton;

/*
 * This type of singleton Design Pattern is used most in Industry
 */

public class DoubleLockingDBConnection {
	
	private static DoubleLockingDBConnection doubleLockingDBConnection;
	
	private DoubleLockingDBConnection() {}
	
	public static DoubleLockingDBConnection getInstance() {
		if(doubleLockingDBConnection == null) {
			synchronized (DoubleLockingDBConnection.class) {
				if(doubleLockingDBConnection == null) {
					doubleLockingDBConnection = new DoubleLockingDBConnection();
				}
			}
		}
		return doubleLockingDBConnection;
	}

}
