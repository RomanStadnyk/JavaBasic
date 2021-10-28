package com.syntax.class04;

import java.util.Scanner;

public class HW_class04_02 {

	public static void main(String[] args) {
		//You are a loan specialist and you need to ask 
	    //user what is the amount of loan is needed. If loan is
		//less or equal to 200,000 then you would lend the money 
		//otherwise you would reject the client.
		
		Scanner scaner=new Scanner(System.in);
		System.out.println("Please, enter the amount of loan you are needed of?");
		double amount=scaner.nextDouble();
		
		if (amount>200000) {
			System.out.println("I'm sorry, but the amount that you are needed of is too big");
		} else {
			System.out.println("Congrats! You are approved for the loan!");
		}
	}

}
