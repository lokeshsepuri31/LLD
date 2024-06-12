package com.example.lld.singleton;

/*
 * This will remove the reordering issue and L1 caching issue for reference https://www.youtube.com/watch?v=upfrQvOgC24&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=32
 */
public class VolatileDBConnection {

	private static volatile VolatileDBConnection volatileDBConnection;
	int localVariable;
	
	private VolatileDBConnection(int localVariable) {
		this.localVariable = localVariable;
	}
	
	public static VolatileDBConnection getInstance() {
		if(volatileDBConnection == null) {
			synchronized (volatileDBConnection) {
				if(volatileDBConnection == null) {
					volatileDBConnection = new VolatileDBConnection(10);
				}
			}
		}
		return volatileDBConnection;
	}
}
