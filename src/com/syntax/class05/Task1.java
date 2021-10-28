package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Prompt the user to enter person heights in inches. 
		//Person should be classified as one of the following:
		//short (under 60 inch)
		//medium(between 60 -72 inch)
		//tall (over 72 inch)

		Scanner scaner=new Scanner(System.in);
		System.out.println("Please, enter your heights in inches:");
		int h=scaner.nextInt();
		
		if (h<60) {
			System.out.println("You are short");
					} 
		else if (h>60 && h<=72) {
			System.out.println("You are medium");
		} else if (h>72) {
			System.out.println("You are tall");
		} else {
			System.out.println("Wrong data entered");
		}
		
	}

}
