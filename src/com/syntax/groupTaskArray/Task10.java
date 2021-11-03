package com.syntax.groupTaskArray;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		int[] array= {1, 45, 21, 456, 88, 93, 32, 999, 1043, 23, 567, 1199};
		int l=array.length;
		int max=0;
		int max2=0;
		
		for(int i=0;i<l;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		for (int i=0;i<l;i++ ) {
				if (array[i]>max2 && array[i]<max) {
						max2=array[i];
					} 
		}	
		
		System.out.println("The Largest number in the array is "+max);
		System.out.println("The Second Largest number in the array is "+max2);
		}

	}


