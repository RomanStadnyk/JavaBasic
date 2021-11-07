package com.syntax.homework.class12;

public class Task02_EvenOdd {
	//Create a method that will take a number and prints whether the number is even or odd.
	public static String evenOdd(int num) {
		if (num%2==0) {
			return "Even";
		} else {
			return "Odd";
		}
	
		
	}
	

	
		public static void main(String[] args) {
			String answer=evenOdd(452);
			System.out.println(answer);
}


}

