package com.syntax.class10;

public class TwoDArrays002 {

	public static void main(String[] args) {
		// Create 2D arrays of groceries
		
		int total=0;
		String[][] groceries= {
				
				{"banana", "apple", "mango"},
				{"potato", "tomato"},
				{"milk", "cheese", "ayran", "yogurt"}
															};		
		System.out.println(groceries.length);
		
		for (int i=0;i<groceries.length;i++) {
			for (int j=0;j<groceries[i].length; j++) {
				System.out.println(groceries[i][j]);
				total++;
			}
			
		}
		
		System.out.println("-------------------------------");
		System.out.println("# of elements "+total);
	}

}
