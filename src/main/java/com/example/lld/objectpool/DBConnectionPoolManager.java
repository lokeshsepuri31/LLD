package com.example.lld.objectpool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {

	List<DBConnection> freeList = new ArrayList<DBConnection>();
	List<DBConnection> inUseList = new ArrayList<DBConnection>();
	private static final int INITIAL_SIZE = 3;
	private static final int MAX_POOL_SIZE = 6;
	private static DBConnectionPoolManager dbConnectionPoolManager;

	public static DBConnectionPoolManager getInstance() {
		if (dbConnectionPoolManager == null) {
			synchronized (DBConnectionPoolManager.class) {
				if (dbConnectionPoolManager == null)
					dbConnectionPoolManager = new DBConnectionPoolManager();
			}
		}

		return dbConnectionPoolManager;
	}

	private DBConnectionPoolManager() {
		for (int i = 0; i < INITIAL_SIZE; i++) {
			freeList.add(new DBConnection());
		}
	}

	public synchronized DBConnection getConnection() {

		if (freeList.isEmpty() && inUseList.size() < MAX_POOL_SIZE) {
			freeList.add(new DBConnection());
		} else if (freeList.isEmpty() && inUseList.size() >= MAX_POOL_SIZE) {
			System.out.println("You cant create the new connection.");
			return null;
		}

		DBConnection connection = freeList.remove(freeList.size() - 1);
		return connection;

	}

	public synchronized void releaseConnection(DBConnection connection) {
		if (connection != null) {
			freeList.add(connection);
			inUseList.remove(connection);
			System.out.println("Removed the connection from inUse and added to free list.");
		}
	}

}
