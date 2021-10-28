package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		
		int age=18;
		int weight=90;
		
		if (age>=18) {
			if (weight>110) {
				System.out.println("You are eligible");
			} else {
				System.out.println("You are not eligible");
			}
		} 
		else {
			System.out.println("You are not eligible");
		}
	}

}
