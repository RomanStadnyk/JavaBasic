package com.syntax.class17;

public class Dog {
	
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;
	
	public Dog(String dogName, String dogColor, String dogBreed, int dogAge, double dogWeight) { // constructor
		System.out.println("Dog constructor is called");
		name=dogName;
		color=dogColor;
		breed=dogBreed;
		age=dogAge;
		weight=dogWeight;
		System.out.println(dogName);
		printAge();
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	public void printBreed() {
		System.out.println(breed);
	}
	
	public void printAge() {
		System.out.println(age);
	}
	
	public void printWeight() {
		System.out.println(weight);
	}
}
