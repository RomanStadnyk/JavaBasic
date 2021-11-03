package com.syntax.class09;

public class HW03_ArrayOfDouble {

	public static void main(String[] args) {
		// Create an array to store double values and then print those in reverse order
		
		double[] n=new double[5];
		n[0]=323.1;
		n[1]=33.61;
		n[2]=2.41;
		n[3]=7.88;
		n[4]=361.45;
		
		for (int i=4; i>=0; i--) {
			System.out.println(n[i]);
		}

	}

}
