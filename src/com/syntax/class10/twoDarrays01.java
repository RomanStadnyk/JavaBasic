package com.syntax.class10;

public class twoDarrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total=0;
		String[][] groceries= {
				
				{"banana", "apple", "mango"},
				{"potato", "tomato"},
				{"milk", "cheese", "ayran", "yogurt"}
															};	
		
		for (String[] grocery:groceries) {
			
			for(String g:grocery) {
				System.out.println(g);
			}
		System.out.println();
		} 

	}

}
