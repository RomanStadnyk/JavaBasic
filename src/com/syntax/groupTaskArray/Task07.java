package com.syntax.groupTaskArray;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number, please:");
		int num=scan.nextInt();
		
		if(num==2 || num%2!=0)
				{
			System.out.println("This number is prime");
				} else {
			System.out.println("This number is not prime");
						}

	}

}
