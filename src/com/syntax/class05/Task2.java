package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Write a program that will print whether it is a weekend or weekday.
		//If any day from 1-5 → output “It is a weekday”, 
		//anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		
		Scanner scaner=new Scanner(System.in);
		System.out.println("Please, enter the number of the day:");
		int day=scaner.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("It is a week day");
		} else if (day>=6 && day<=7) {
			System.out.println("It is a weekend");}
		else {
			System.out.println("Wrong data entered");
		}

	}

}
