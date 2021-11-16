package com.syntax.class15;

public class PalindromCheck {

	public static void main(String[] args) {
		// Check if string is palindrome or not
		
		String str="ababa";
		StringBuilder strB=new StringBuilder(str);
		strB.reverse();
		if(str.equals(strB.toString())) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" Not is palindrome");
		
		}
	}

}
