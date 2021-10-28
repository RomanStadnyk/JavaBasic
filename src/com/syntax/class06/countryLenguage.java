package com.syntax.class06;

import java.util.Scanner;

public class countryLenguage {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please, enter the country you were born ");
			String c=scan.next();
			String lang=null;
			
			switch (c.toUpperCase()) {
			case "USA":
				lang="English";
				break;
			case "MEXICO":
				lang="Spanish";
				break;
			case "POLAND":
				lang="Polish";
				break;
			case "ITALIA":
				lang="Italian";
				break;
			case "FRANCE":
				lang="French";
				break;
			case "UKRAINE":
				lang="Ukrainian";
				break;
				default:
					lang="Unknown";
					
			}
			if (!lang.equals("Unknown")) {
			System.out.println("Based on the country you entered Your language is "+lang);
			} else {
				System.out.println("Try another country");
			}
		}
	}


