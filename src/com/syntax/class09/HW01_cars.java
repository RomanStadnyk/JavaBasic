package com.syntax.class09;

public class HW01_cars {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		
		String [] car= {"BMW", "Lada", "Ford", "Mersedes", "Toyota", "Nissan"};
		int l=car.length;
		int j=0;
		
		for (String i: car) {                                              //first loop
			System.out.println(i);
		}
		System.out.println("----------------------------------");
		
		while(j<l) {                                                       //second loop
				System.out.println(car[j]);
				j++;
			}
	}

}
