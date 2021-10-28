package com.syntax.class04;

import java.util.Scanner;

public class HW_class04_06 {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years and annual salary.
		//If user worked for more or equals to 5 years than user is eligible for the bonus,
		//otherwise he is not. Once user is eligible and salary is larger than 50000
		//than bonus = 5000, otherwise bonus=3000.

		Scanner scaner=new Scanner(System.in);
		System.out.println("Plese, enter the numbers of worked years:");
		int years=scaner.nextInt();
		System.out.println("Plese, enter your annual salary:");
		int salary=scaner.nextInt();
		
		if(years<5) {
			System.out.println("You are not eligible for any bonuses.");
		} else if (salary>50000) {
			System.out.println("You are eligible for bonus, it is 5000");
		} else {
			System.out.println("You are eligible for bonus, it is 3000");

		}
	}

}
