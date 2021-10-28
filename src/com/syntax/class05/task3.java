package com.syntax.class05;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		//Ask user to enter 3 numbers and define which is the largest number.
		
		Scanner scaner=new Scanner(System.in);
		System.out.println("Please, enter the number :");
		int a=scaner.nextInt();
		
		System.out.println("Please, enter the number one more time :");
		int b=scaner.nextInt();
		
		System.out.println("Please, enter the number last time :");
		int c=scaner.nextInt();
		
		if (a>b && a>c) {
			System.out.println("The "+a+" is biger than "+b+" and "+c);
		} else if (b>a && b>c) {
			System.out.println("The "+b+" is biger than "+a+" and "+c);
		} else if (c>a && c>b) {
			System.out.println("The "+c+" is biger than "+a+" and "+b);
		} else {
			System.out.println("wrong input");
		}

	}

}