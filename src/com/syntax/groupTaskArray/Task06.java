package com.syntax.groupTaskArray;

public class Task06 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		int a=5;
		int b=12;
		System.out.println("At first a="+a+" and b="+b);
		int[] ab={a,b};
		
		a=ab[1];
		b=ab[0];
		
		System.out.println("And now a="+a+" and b="+b);

	}

}
