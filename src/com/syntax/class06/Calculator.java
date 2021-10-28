package com.syntax.class06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
		//Please complete this assignment in 2 ways: using if statement and switch case.
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=s.nextInt();
		System.out.println("Enter second number");
		int n2=s.nextInt();
		System.out.println("Enter operator sign (+, -, *, /)");
		String op=s.next();
		int result=0;
		boolean operator=true;

		if(op.equals("+")){
			result=n1+n2;			
		}else if(op.equals("-")) {
			result=n1-n2;
		}else if(op.equals("*")) {
			result=n1*n2;
		}else if(op.equals("/")) {
			result=n1/n2;
		}else {
			operator=false;}
			
		if (operator) {
			System.out.println("The result for your numbers is "+result);
		} else {
			System.out.println("The operator you have entered is unacceptable");
		}
	}

}
