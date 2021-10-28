package com.syntax.class06;

import java.util.Scanner;

public class CountryFood {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please, enter the number the country you were born ");
		String c=scan.next();
		String FavFood=null;
		
		switch (c.toLowerCase()) {
		case "usa":
			FavFood="Hamburger";
			break;
		case "mexico":
			FavFood="Taco";
			break;
		case "canada":
			FavFood="Maple Syrup";
			break;
		case "italia":
			FavFood="Pizza";
			break;
		case "france":
			FavFood="Croissant";
			break;
		case "jamaica":
			FavFood="Cannabis banana bread";
			break;
			default:
				FavFood="Unknown";
				
		}
		if (!FavFood.equals("Unknown")) {
		System.out.println("Your favorite food is "+FavFood);
		} else {
			System.out.println("Try another country");
		}
	}

}
