package com.syntax.groupTaskArray;

public class Task03 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum of 
		//even and odd numbers for that array.
		
		int[][] array= {
				{233, 5, 8, 96, 7, 1463},
				{4, 552, 71, 92, 11, 44},
				{39, 74, 52, 88, 71, 2},
					};
		
		int EvenSum=0;
		int OddSum=0;
		
		for (int[] ar:array) {
			for (int a:ar) {
				if (a%2==0) {
					EvenSum=EvenSum+a;
				}else {
					OddSum=OddSum+a;
									}
										}
											}
		System.out.println("The sum of all even numbers in this array is "+EvenSum);
		System.out.println("The sum of all odd numbers in this array is "+OddSum);

	



	}

}
