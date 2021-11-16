package com.syntax.class14;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Nasira";
		System.out.println(name.length());   // returns qunt. of character
		System.out.println(name.startsWith("N")); // returns true if string starts with parameters
		System.out.println(name.startsWith("A"));
		System.out.println(name.endsWith("r"));
		System.out.println(name.contains("p"));
		System.out.println(name.charAt(0));  //to check what is the value of certain index in a string
		System.out.println(name.indexOf("a",2));
		System.out.println(name.substring(3,4));//first number - index of start, sec. num - index of end
		System.out.println(name.isEmpty());// check if String is empty
		System.out.println(name.trim()); // trim spaces in both ends
		String s="This is Java class";
		System.out.println(s.split( " ").length);
		
	}

}
