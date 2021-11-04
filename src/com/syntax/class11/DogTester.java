package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an object of Dog class
		Dog alonaDog=new Dog();
		alonaDog.name="Lexy";
		alonaDog.breed="American Hound";
		alonaDog.colors="Black";
		alonaDog.height=2.5;
		alonaDog.age=10;
		alonaDog.gender='M';
		
		System.out.println("The Dog name is "+alonaDog.name);
		System.out.println("Its breed is "+alonaDog.breed);
		System.out.println("Color is "+alonaDog.colors);
		
		Dog romaDog= new Dog();
		romaDog.name="Knopa";
		romaDog.breed="Bolonka";
		romaDog.colors="Black";
		romaDog.height=5.5;
		romaDog.age=1;
		romaDog.gender='F';
		System.out.println("**********************************");
		System.out.println("The Dog name is "+romaDog.name);
		System.out.println("Its breed is "+romaDog.breed);
		System.out.println("Color is "+romaDog.colors);
		System.out.println("Age is "+romaDog.age);
		
	}

}
