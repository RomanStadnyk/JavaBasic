
package com.syntax.class10;

public class HW04_ArrayOfGroceries {

	public static void main(String[] args) {
		//Inside you should have an array of veggies, fruits, dairy and sweets.
		//Retrieve all values from that array using 2 different loops
		
		String [][] groceries= {
				{"patato", "tomato", "carrot", "pea", "salad"},
				{"lemon", "cherry", "pineapple", "mango"},
				{"milk", "sour cream", "yogurt"},
				{"caramel", "brownie", "cake", "ice cream"},
									};
		
		for (int i=0;i<groceries.length;i++) {
			for (int j=0;j<groceries[i].length;j++) {
				System.out.println(groceries[i][j]);
			}
			System.out.println();
		}
		System.out.println("******************************");
		
		for (String[] gro: groceries) {
			for(String g:gro) {
				System.out.println(g);
			}
			System.out.println();
		}
		

	}

}
