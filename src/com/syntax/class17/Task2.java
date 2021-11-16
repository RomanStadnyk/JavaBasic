package com.syntax.class17;

public class Task2 {
	/*
	 * Write a java Class Students that have a constructor which 
	 * takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average
	 * Grade. Test Student class for 5 different students 
	 * with different marks. Your program should print an average 
	 * mark of each students name.
     * NOTE: please use different names for
     * instance and local variables.
	 */

	String name;
	double grade1;
	double grade2;
	double grade3;
	
	public Task2(String name, double grade1, double grade2, 
			double grade3) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}
	
	public void printAvGrade() {
		System.out.println(""+name+" - "+(grade1+grade2+grade3)/3);
	}
	
	
	
}
