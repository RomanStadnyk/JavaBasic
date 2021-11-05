package com.syntax.homework.class11;

public class Dog {
		String name;
		String breed;
		String colors;
		double height;
		int age;
		char gender;
		
		void barking() {
			System.out.println(name+" is barking a lot.");
				}
		void eating() {
			System.out.println(name+" is eating as well.");
				}
		void playing() {
			System.out.println(name+" likes to play and fetch the stick like crazy.");
				}

public static void main(String[] args) {
		Dog Husky=new Dog();
		Husky.name="Fido";
		Husky.breed="Siberian Husky";
		Husky.colors="Black & White";
		Husky.height=20;
		Husky.age=4;
		Husky.gender='M';
		
		System.out.println("This is a "+Husky.breed+" you are looking at.");
		System.out.println("Its name is "+Husky.name);
		if (Husky.gender=='M') {System.out.println("Its a boy!");} else {System.out.println("Its a girl!");}
		System.out.println("Color: "+Husky.colors);
		System.out.println("Height: "+Husky.height+" inches");
		System.out.println("Age: "+Husky.age+" years");
		System.out.println("");
		
		Husky.barking();
		Husky.eating();
		Husky.playing();
		
		System.out.println("--------------------------");
		
		Dog Bulldog=new Dog();
		Bulldog.name="Sparky";
		Bulldog.breed="English Bulldog";
		Bulldog.colors="Red";
		Bulldog.height=15;
		Bulldog.age=1;
		Bulldog.gender='F';
		
		System.out.println("This is a "+Bulldog.breed+" you are looking at.");
		System.out.println("Its name is "+Bulldog.name);
		if (Bulldog.gender=='M') {System.out.println("Its a boy!");} else {System.out.println("Its a girl!");}
		System.out.println("Color: "+Bulldog.colors);
		System.out.println("Height: "+Bulldog.height+" inches");
		System.out.println("Age: "+Bulldog.age+" year");
		System.out.println("");
		
		Bulldog.barking();
		Bulldog.eating();
		Bulldog.playing();
		
		System.out.println("--------------------------");
		
		Dog Labrador=new Dog();
		Labrador.name="Olgert";
		Labrador.breed="Labrador Retriever";
		Labrador.colors="White";
		Labrador.height=22;
		Labrador.age=8;
		Labrador.gender='M';
		
		System.out.println("This is a "+Labrador.breed+" you are looking at.");
		System.out.println("Its name is "+Labrador.name);
		if (Labrador.gender=='M') {System.out.println("Its a boy!");} else {System.out.println("Its a girl!");}
		System.out.println("Color: "+Labrador.colors);
		System.out.println("Height: "+Labrador.height+" inches");
		System.out.println("Age: "+Labrador.age+" year");
		System.out.println("");
		
		Labrador.barking();
		Labrador.eating();
		Labrador.playing();
		
}

}