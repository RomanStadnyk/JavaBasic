package com.syntax.class09;

public class HW04_ArrayOfInt {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array
		
		int[] num= {2, 45, 67, 33,2,467};
		int l=num.length;
		int sum=0;
		
		for(int i=0; i<l;i++) {
		sum=sum+num[i];
		System.out.print(" + "+num[i]+" ");
		}
		System.out.print(" = "+sum);

	}

}
