package com.syntax.class10;

public class HW02_NameAndGradesArray {

	public static void main(String[] args) {
		// Create a 2D array in which first array will consist of 4 names 
		//and second array will contain grades. 
		//Then your program should print name of the students that has A and B grade
		
		String[][] namesGrades= {
				{"Andrew", "Lina", "Carla", "Jose"},
				{"A", "D", "B", "C"},
									};
			for (int i=0;i<namesGrades.length;i++) {
				for (int n=0;n<namesGrades[i].length;n++) {
					if (namesGrades[i][n].equals("A") || namesGrades[i][n].equals("B")) {
						System.out.println("Student "+namesGrades[i-1][n]+" -- "+namesGrades[i][n]+" grade.");
					}
					
				}
			}

	}

}
