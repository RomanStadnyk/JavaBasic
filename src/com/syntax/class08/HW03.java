package com.syntax.class08;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point),
		//provided by a user and then from that range prints the sum of the even and odd integers.
		Scanner scan=new Scanner(System.in);
		System.out.println("Set the range of integers. What is the start point?");
		int start=scan.nextInt();
		System.out.println("What is the end point?");
		int end=scan.nextInt();
		int sumEven;
		int sumOdd;
		if (start%2==0) {
			sumEven=start;
			sumOdd=start+1;
		} else {
			sumEven=start+1;
			sumOdd=start;
		}
		
		for (int i=start+2; i<=end; i++) {
			if(i%2==0) {
			sumEven=sumEven+i;} 
			else {
				sumOdd=sumOdd+i;
			}
		}
		System.out.println("Sum of even integers in the range from "+start+" to "+end+" is "+sumEven);
		System.out.println("Sum of odd integers in the range from "+start+" to "+end+" is "+sumOdd);
	}

}
