package com.syntax.class16;

public class AccessModiferDemo1 {
	
	private String name;
	int age;
	public double salary;
	
	void displayName() {
		System.out.println(name);
	}
	
	void displayAge() {
		System.out.println(age);
	}
	
	void displaySalalry() {
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		AccessModiferDemo1 am=new AccessModiferDemo1();
			am.name="Namil";
			am.age=22;
			am.salary=1230000;
	}

}
