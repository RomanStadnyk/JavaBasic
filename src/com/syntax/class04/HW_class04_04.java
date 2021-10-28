package com.syntax.class04;

import java.util.Scanner;

public class HW_class04_04 {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and print
		//“The temperature is the city __ is __”
		
		Scanner scaner=new Scanner(System.in);
		System.out.println("Please, enter the city you are in:");
		String city=scaner.next();
		System.out.println("Please, enter the temperature of the air in Fahrenheits:");
		double tempF=scaner.nextDouble();
		
		double tempC=(tempF-32)*0.5556;
		
		System.out.println("The temperature is the city "+city+" is "+tempC+" C");
	}

}
