package com.syntax.homework.class12;

public class Mail {
	//Create a method createEmail(). Based on values of users name, 
	//lastName and email type, your method should return complete email 
	//Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or 
	
	static String eMail(String name, String lastname, String mailService) {
		String eMail=name+lastname+"@"+mailService+".com";
		return eMail;
	}

	
	
	public static void main(String[] args) {
		String ans=eMail("Roman", "Stadnyk", "gmail");
		System.out.println(ans);
		

	}
		
	}

