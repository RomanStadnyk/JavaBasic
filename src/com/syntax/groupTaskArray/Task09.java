package com.syntax.groupTaskArray;

public class Task09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int[] array= {13, 45, 3, 86, 4, 22, 6, 9, 47, 21, 456, 88, 93, 32, 999, 1043, 23, 567, 1199};
		int l=array.length;
		int max=0;
		int min=array[1];
		
		for(int i=0;i<l;i++) {
			if(array[i]>max) {
				max=array[i];
			}else if(array[i]<min) {
				min=array[i];
			}
			}
		
		System.out.println("Maximum number is "+max);
		System.out.println("Minimum number is "+min);
	}

}
