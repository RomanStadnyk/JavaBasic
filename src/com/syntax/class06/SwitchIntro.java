package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=14;
			
		switch(month) {
		
		case 1:
			System.out.println("This is January, month # "+month);
			break;
		case 2:
			System.out.println("This is February, month # "+month);
			break;
		case 3:
			System.out.println("This is March, month # "+month);
			break;
		case 4:
			System.out.println("This is April, month # "+month);
			break;
		case 5:
			System.out.println("This is May, month # "+month);
			break;
		case 6:
			System.out.println("This is June, month # "+month);
			break;
		case 7:
			System.out.println("This is July, month # "+month);
			break;
		case 8:
			System.out.println("This is August, month # "+month);
			break;
		case 9:
			System.out.println("This is September, month # "+month);
			break;
		case 10:
			System.out.println("This is October, month # "+month);
			break;
		case 11:
			System.out.println("This is November, month # "+month);
			break;
		case 12:
			System.out.println("This is December, month # "+month);
			break;
			default:
				System.out.println("There is no such a month with # "+month);
				break;
		}
		
	}

}
