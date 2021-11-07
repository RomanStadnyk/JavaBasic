package com.syntax.homework.class12;

public class SayHello {
	//Create a method that will say Hello in different language based on the country that will passed when method is executed.
	
	public static String sayHello(String country) {
		String say="hi";
		switch (country) {
		case "usa":
			say="Hello";
			break;
		case "mexico":
			say= "Hola";
			break;
		case "germany":
			say= "Guten Tag";
			break;
			
		}
		 return say; 
	}
	public static void main (String[] args) {
		String answer=sayHello("germany");
		System.out.println(answer);
	}
	
	
}
