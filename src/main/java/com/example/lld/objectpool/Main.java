package com.example.lld.objectpool;

public class Main {

	public static void main(String[] args) {
		DBConnectionPoolManager connectionPoolManager = DBConnectionPoolManager.getInstance();
		DBConnection connection = connectionPoolManager.getConnection();

		connectionPoolManager.releaseConnection(connection);

	}
}
