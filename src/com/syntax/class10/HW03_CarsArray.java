package com.syntax.class10;

public class HW03_CarsArray {

	public static void main(String[] args) {
		// Create 2D array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops
		
		String[][] countryCars= {
				{"American", "German", "Korean", "Italian"},
				{"Ford", "BMW", "KIA", "Ferrari"},
		                               };
		
		for (int i=0;i<countryCars.length/2;i++) {
			for(int j=0;j<countryCars[i].length;j++) {
				System.out.println(countryCars[i][j]+" - "+countryCars[i+1][j]);
			}
		}
		System.out.println("------------------------");
		
		
		for (String[] cars:countryCars) {
			for(String c:cars) {
				System.out.println(c);
			}
			System.out.println();
		}
	}
}
