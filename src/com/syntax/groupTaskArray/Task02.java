package com.syntax.groupTaskArray;

public class Task02 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.
		//Develop a program which will identify/print the even numbers only.
		
		int[][] arr= {
				{23, 5, 8, 96, 7, 16},
				{4, 55, 71, 92, 11, 44},
				{39, 74, 52, 88, 1, 2},
					};
		for (int[] ar:arr) {
			for (int a:ar) {
				if (a%2==0) {
					System.out.println(a);
				}
			}
		}

	}

}
