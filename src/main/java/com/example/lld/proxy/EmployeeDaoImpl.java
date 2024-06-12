package com.example.lld.proxy;

public class EmployeeDaoImpl implements EmployeeaDao {

	@Override
	public void create(Employee emp) {
		System.out.println("Create method is called");
	}

	@Override
	public void delete(int empId) {
		System.out.println("Delete method is called");
	}

	@Override
	public Employee fetch(int empId) {
		System.out.println("Fetch method is called");
		return new Employee();
	}

}
