package com.syntax.class05;

import java.util.Scanner;

public class HW_01 {

	public static void main(String[] args) {
		//Write a program for user to enter his/hers birth month. Based on the month define the season.
		//Example: if user is born in June, July or August → season =“Summer”.
		//	At the end of the program we should see output as “You were born is season ______“. 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please, enter the number of the month you were born (from 1 to 12)");
		int month=scan.nextInt();
		String season;
		
		if (month==1 || month==2 || month==12) {
			season="Winter";}
			else if (month==3 || month==4 || month==5) {
				season="Spring";}
			else if (month==6 || month==7 || month==8) {
				season="Summer";}
			else if (month==9 || month==10 || month==11) {
				season="Autumn";}
			else {
				season="not existing yet because you entered invalid number of the month";}
		
		System.out.println("The season you were born is "+season);
		
	}

}
