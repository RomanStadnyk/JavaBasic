package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		/*
		 * nested loop --> loop inside another loop
		 */
		for (int i=1; i<=3; i++) { //outer loop
			System.out.println("I am outer loop");
			
			for (int j=1; j<=4; j++) {
				System.out.println("I am inner loop");
			}
		}
	}

}
