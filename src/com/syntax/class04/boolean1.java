package com.syntax.class04;

import java.util.Scanner;

public class boolean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		boolean condition = input.nextBoolean();
		
		
		
		if(condition==true) {
			System.out.println("What is the balance on your credit card?");
			
			double balance = input.nextDouble();
			
			if(balance<1000) {
				System.out.println("Pay it off immediately.");
			} else {
				System.out.println("You need to spend more");
			}
		} else {
			System.out.println("Would you like to get a credit card?");
		}
	}

}
