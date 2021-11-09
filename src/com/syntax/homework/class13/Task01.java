package com.syntax.homework.class13;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby
		 */
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter pls mother's first name: ");
		String nameMom = inp.next();
		System.out.print("Enter pls father’s first name: ");
		String nameDad = inp.next();
		System.out.print("Boy or Girl: ");
		String gender = inp.next();

		if (gender.equalsIgnoreCase("boy")) {
			System.err.println(
					"Suggested baby name: " + nameDad.substring(0, 3) + nameMom.substring(nameMom.length() - 2));
		} else if (gender.equalsIgnoreCase("girl")) {
			System.out.println("Suggested baby name: " + nameMom.substring(0, 2)
					+ nameDad.toLowerCase().substring(nameDad.length() - 3));
		} else {
			System.out.println("The sex is incorect. Try again.");
		}
	}

}
