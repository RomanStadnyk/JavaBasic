package com.syntax.groupTaskArray;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		//  Create an array on double values using scanner and calculate the sum of all stored elements in that array.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements your array should have?");
		int size=scan.nextInt();
		double sum=0;

		double[] array= new double[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter your element:");
			array[i]=scan.nextDouble();
			sum=sum+array[i];
		}
		System.out.println("The sum of all elements of this array is "+sum);
	}

}
