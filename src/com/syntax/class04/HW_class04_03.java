package com.syntax.class04;

import java.util.Scanner;

public class HW_class04_03 {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age.
		//If they are 18 and older you will issue a driver license to them,
		//otherwise you will offer them to get a learners permit.
		
		Scanner scaner=new Scanner(System.in);
		System.out.println("Please, enter your age");
		int age=scaner.nextInt();
		
		if (age<18) {
			System.out.println("You should get a learners permit.");
		} else {
			System.out.println("You are approved to get a driver license.");
			
		}
	}

}
