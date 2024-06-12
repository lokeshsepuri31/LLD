package com.example.lld.prototype;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setAge(20);
		student.setName("Abhishek");
		student.setRollNumber(1);
		
		Student student1 = (Student) student.clone();
		
		System.out.println("My name is: "+ student1.getName() +" and My age is: "+student1.getAge());
		
	}
}
