package com.example.lld.proxy;

public class Main {

	public static void main(String[] args) {
		EmployeeaDao employeeDao = new EmployeeDaoImplProxy("ADMIN");
		employeeDao.create(new Employee());
	}
	
}
