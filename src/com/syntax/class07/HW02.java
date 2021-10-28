package com.syntax.class07;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		// Ask user what he/she wants to buy, ask for price and to pay for an item.
	    // continue asking to pay until user gets a right amount.
	    //  conditions: 
	     //              if user gives extra money --> give change
		//	   if user gives less money --> ask how much more you need
	//The amount has to be accumulated if users add more money
	//Whenever a user is done with payments, tell them “Thank you for shopping!”
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What item do you want to buy?");
		String item=scan.next();
		System.out.println("What is the item price?");
		int itemPrice=scan.nextInt();
		System.out.println("What price are you ready to pay for "+item+"?");
		int userPay=scan.nextInt();
		int deff=itemPrice-userPay;
			
		
		if(deff<0) {
			int change=userPay-itemPrice;
			System.out.println("Here is your change "+change);
					} else if (deff>0) {
						while(userPay!=itemPrice) {
							int owe=itemPrice-userPay;
							System.out.println("you still owe us "+owe);
							int userOweSum=scan.nextInt();
							userPay=userPay+userOweSum;}
						
					}System.out.println("Thank you for shopping!");
	}

}
