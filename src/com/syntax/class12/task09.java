package com.syntax.class12;

public class task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers= {10, 5, 3, -5, 15, 67};
		int largestNumber=Integer.MIN_VALUE;
		int smallestNumber=Integer.MAX_VALUE;
		
		for (int i=0;i<numbers.length;i++){			
			if (numbers[i]>largestNumber) {
				largestNumber=numbers[i];
			}
			
			if (numbers[i]<smallestNumber) {
				smallestNumber=numbers[i];
				}
			
	}
	}
}
