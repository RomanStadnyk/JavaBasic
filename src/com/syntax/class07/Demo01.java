package com.syntax.class07;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		// ask user name and age 5 time
		
		Scanner scan=new Scanner(System.in);
		int i=5;
		while (i>=1) {
		System.out.println("Enter name and age");
		
		String name=scan.next();
		int age=scan.nextInt();
		
		System.out.println("Name "+name+" age "+age);
		i--;
		}
	}

}
