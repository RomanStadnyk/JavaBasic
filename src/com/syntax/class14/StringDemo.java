package com.syntax.class14;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		
		String str="Today is Tuesday? Today we have java class.";
		String[] strArr=str.split("[T]"); // [T] - character on which we split the String to  elements of array
		System.out.println(Arrays.toString(strArr));
	}

}
