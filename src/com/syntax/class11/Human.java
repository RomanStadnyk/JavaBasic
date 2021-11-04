package com.syntax.class11;

public class Human {
	String name;
	int age;
	double height;
	char gender;
	String bloodType;
	
	void eat() {
		System.out.println(name+" eats a lot");
	}
	void sleep() {
		System.out.println(name+" is sleeping");
	}
	
	void walk() {
		System.out.println(name+" with bloodtype "+bloodType);}
				
		void sendLove() {
			if (name.equals("Bohdana Smyrnova")) {
				System.out.println("Send Love and Hugs");
		}
		
	}

}
