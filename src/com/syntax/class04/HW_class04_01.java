package com.syntax.class04;

import java.util.Scanner;

public class HW_class04_01 {

	public static void main(String[] args) {
		// Create a Java program to capture 2 numbers from a user and define 
		//which number is the largest.
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter a number");
		double a=scn.nextDouble();
		System.out.println("Please enter a number one more time");
		double b=scn.nextDouble();
		
		if (a==b) {
			System.out.println("First number "+a+" is equal to second "+b);
		}else if (a>b) {
			System.out.println("First number "+a+" is biger than second "+b);
		} else if (a<b){
			System.out.println("Second number "+b+" is biger than first "+a);
		}
		
	}

}
