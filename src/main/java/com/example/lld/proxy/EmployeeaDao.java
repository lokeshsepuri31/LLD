package com.example.lld.proxy;

public interface EmployeeaDao {

	public void create(Employee emp);
	public void delete(int empId);
	public Employee fetch(int empId);
}
