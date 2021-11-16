package com.syntax.class16;

public class Dog {
	
	String name;
	String color;
	static int noOfLegs=4;
	
	void displayColor() {
		System.out.println(color);
		}
	
	void displayName() {
		System.out.println(name);
		}
	static void DisplayLegs() {
		System.out.println(noOfLegs);
	}
		void printInfo() {
			displayName();
			displayColor();
			DisplayLegs();
		}
	}

