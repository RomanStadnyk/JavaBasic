package com.syntax.class06;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=s.nextInt();
		System.out.println("Enter second number");
		int n2=s.nextInt();
		System.out.println("Enter operator sign (+, -, *, /)");
		String op=s.next();
		int result=0;
		boolean operator=true;

		switch (op) {
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "*":
			result=n1*n2;
			break;
		case "/":
			result=n1/n2;
		break;
		default:
			operator=false;}
			
		if (operator) {
			System.out.println("The result for your numbers is "+result);
		} else {
			System.out.println("The operator you have entered is unacceptable");
		}
	}
	}


