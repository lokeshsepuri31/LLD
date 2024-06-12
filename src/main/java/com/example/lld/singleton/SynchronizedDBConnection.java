package com.example.lld.singleton;

/*
 * This type of SDP is having the limitation of locking for every thread when calling getInstance
 */

public class SynchronizedDBConnection {

	private static SynchronizedDBConnection synchronizedDBConnection;
	
	private SynchronizedDBConnection () {}
	
	public synchronized static SynchronizedDBConnection getInstance() {
		if(synchronizedDBConnection == null) {
			synchronizedDBConnection = new SynchronizedDBConnection();
		}
		return synchronizedDBConnection;
	} 
	
}
