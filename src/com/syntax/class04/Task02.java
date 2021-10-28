package com.syntax.class04;

public class Task02 {

	public static void main(String[] args) {
		//Create a Java program and store values of mortgage rate and mortgage price. 
		//First, program should check if rate is higher than 4.5 user will not buy a house, 
		//otherwise user will consider buying. Once user decides to buy a house, if price 
		//of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
		
		double mRate=1.2;
		double mPrice= 1500000;
		
		if (mRate>4.5) {
			System.out.println("You will not buy a house");
		}else {
			System.out.println("You will buy a house");
				if (mPrice>200000) {
					System.out.println("You're gonna take a loan");
				}else {
					System.out.println("You can pay cash.");
				}
		}
	
	}

}
