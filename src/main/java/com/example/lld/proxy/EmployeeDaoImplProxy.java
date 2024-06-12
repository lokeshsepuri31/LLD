package com.example.lld.proxy;

public class EmployeeDaoImplProxy implements EmployeeaDao {

	EmployeeDaoImpl employeeDaoImpl;
	
	String client;
	
	EmployeeDaoImplProxy(String client) {
		this.client = client;
		employeeDaoImpl = new EmployeeDaoImpl();
		System.out.println("Client is a: " + this.client);
	}
	
	@Override
	public void create(Employee emp) {
		if(client.equals("ADMIN")) {
			employeeDaoImpl.create(emp);
			return;
		}
		System.out.println("Access Denied");
	}

	@Override
	public void delete(int empId) {
		if(client.equals("ADMIN")) {
			employeeDaoImpl.delete(empId);
			return;
		}
		System.out.println("Access Denied");
	}

	@Override
	public Employee fetch(int empId) {
		if(client.equals("USER") || client.equals("ADMIN"))
			return employeeDaoImpl.fetch(empId);
		return null;
	}

}
