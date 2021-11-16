package com.syntax.homework.class17;

public class Task1 {
	
	private String name;
	private String username;
	private int age;
	
	Task1() {
	}
	
	public Task1(String name, String username, int age) {
		super();
		this.name = name;
		this.username = username;
		this.age = age;
	}

	private Task1(String name, String username ) {
	
		this.name = name;
		this.username = username;
		System.out.println(name);
		
	}

	protected Task1(String username) {
		super();
		this.username = username;
		System.out.println(username);
	}
	
	void printUsername() {
		System.out.println(username);
	}
	
	public static void main(String[] args) {
		
		Task1 user1=new Task1("Roman", "banan4ik", 38);
		user1.printUsername();
	}
	
	 

}
