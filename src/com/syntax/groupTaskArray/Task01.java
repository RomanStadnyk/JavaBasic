package com.syntax.groupTaskArray;

public class Task01 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] a= {
				{23, 5, 8, 96, 7},
				{4, 55, 71, 92, 11},
				{39, 74, 52, 88},
					};
		int sum=0;
		
		for (int a1[]:a) {
			for(int a2:a1) {
				sum=sum+a2;
				
			}
		}
		System.out.println("The sum of all numbers is "+sum);
	}

}
