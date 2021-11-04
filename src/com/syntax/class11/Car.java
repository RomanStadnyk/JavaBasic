package com.syntax.class11;

public class Car {
	
	String make;
	String model;
	String color;
	int year;
	double milage;
	
	void moveForward() {         //defining behavior
		System.out.println("Moving forward");
		applyBreaks(); //
	}
	
	void applyBreaks( ) {			//defining behavior
		System.out.println("Hit the break");
	}
	
	public static void main(String[] args) {
		
		Car romanCar = new Car();
		romanCar.make="Tesla";
		romanCar.model="S";
		romanCar.color="Orange";
		
		romanCar.moveForward();  //calling the behavior
		
		System.out.println("My car is "+romanCar.make);
		System.out.println("Its color is "+romanCar.color);
		System.out.println("The model is "+romanCar.model);
		
		romanCar.applyBreaks();//calling the behavior
	}
	
}
