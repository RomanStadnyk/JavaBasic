package com.syntax.class08;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		// Create a program that will keep asking user to apply for a credit card. 
		//As soon you get “yes” from a user program should stop asking.
		
		
		Scanner scan=new Scanner(System.in);
		String Answer;
		do {
			System.out.println("Would you like to applly for the credit card?");
			Answer=scan.next();
			
		} while(!Answer.equalsIgnoreCase("yes"));
			System.out.println("You got it, lucky one!");
	}

}
