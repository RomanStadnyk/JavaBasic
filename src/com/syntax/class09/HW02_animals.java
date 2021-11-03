package com.syntax.class09;

public class HW02_animals {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.
		
		String[] beast={"Dog","Cat", "Bat", "Eagle", "Lion", "Rat"};
		int ar_len=beast.length;
		int k=0;
		
		for (String i:beast) {
			System.out.println(i);
		}
System.out.println("----------------------------------");
		
		while(k<ar_len) {                             
				System.out.println(beast[k]);
				k++;
			}
	}

}
