package com.syntax.homework.class17;
/*
 * Write a Student class   that have instance variables name and address. 
 * Create a constructor that will initialize those variables. 
 * Print name & address of given  student using displayInfo method.
 * 
 */
public class Task2 {
	private String name;
	private String address;
	
	

	public Task2(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	void displayInfo() {
		System.out.println("Student name: "+name);
		System.out.println("Student address: "+address);
	}

}
