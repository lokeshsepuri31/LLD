package com.example.lld.prototype;

public class Student implements Prototype {

	private int rollNumber;
	private int age;
	private String name;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Prototype clone() {
		Student newStudent = new Student();
		newStudent.setAge(this.age);
		newStudent.setName(this.name);
		newStudent.setRollNumber(this.rollNumber);

		return newStudent;
	}
}
