package com.syntax.class04;

import java.util.Scanner;

public class HW_class04_05 {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not.
		//If you user does not have a credit card then offer them. 
		//If they do have one ask what is balance on the card? If balance of the 
		//card is larger than 1000, tell them to pay off immediately, 
		//otherwise you can tell them that they can spend more.
		
		
		Scanner scaner=new Scanner(System.in);
		System.out.println("Do you have credit card or not? If you do, enter 1, if not enter 2:");
		int answer=scaner.nextInt();
		 if (answer==1) {
			 System.out.println("Enter the sum of balance on your card:");
			 int balance=scaner.nextInt();
			 	if (balance>1000) {
			 		System.out.println("You have to pay immediatly!");
			 	}else {
			 		System.out.println("You can spend more money.");
			 	}
		 }else if(answer==2) {
			 System.out.println("You could apply for the credit card if you want to");
		 }
		 else {
			 System.out.println("The number you have entered is not valid");
		 }

	}

}
