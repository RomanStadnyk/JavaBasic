package com.syntax.class14;

public class HWtask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Create a String that will hold a sentence. Write a program to get a new String without any spaces.";
		System.out.println(str.replace(" ", ""));
		str=str.replaceAll("\\s", "");
		System.out.println(str); //string is immutable 
		StringBuilder str2=new StringBuilder("Create a String that will hold a sentence.");
		System.out.println(str2.reverse());
		System.out.println(str2); //stringBuilder is mutable, it means changes apples to original variable.
		
		//string class: we use it when we dont change the code 
		//while we use stringbuilder when we change the code constantly

	}

}
