package com.example.lld.singleton;

public class EagerDBConnection {

	private static EagerDBConnection dbConnection = new EagerDBConnection();

	private EagerDBConnection() {}

	public static EagerDBConnection getInstance() {
		return dbConnection;
	}
}
