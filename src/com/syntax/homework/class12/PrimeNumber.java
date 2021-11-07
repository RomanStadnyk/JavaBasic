package com.syntax.homework.class12;

public class PrimeNumber {
	//Write a method to return whether given number is prime or not?
	
	static String prime (int number) {
		if (number==2 || number%2!=0) {
			return "Prime";
		} else { return"Not Prime.";}
		
	}
	
	public static void main(String[] args) {
		String answer=PrimeNumber.prime(556);
		System.out.println(answer);
	}
}
