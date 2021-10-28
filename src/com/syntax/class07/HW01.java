package com.syntax.class07;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=2;
		
		for (int n=4;n<=100;n=n+2) {
			sum=sum+n;
		}
		System.out.println("The sum of all even numbers from 1 to 100 is "+sum);
		
		sum=1;
		for (int n=3;n<=100;n=n+2) {
			sum=sum+n;
		}
		System.out.println("The sum of all odd numbers from 1 to 100 is "+sum);
		
		
	}

}
