package com.syntax.class07;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		/* create a secret number (1 to 100)
		*
		*ask user to guess my secret number
		* keep asking till user gets number
		*/
	int secretNum=78;
	Scanner scan=new Scanner(System.in);
	int userNum; 	
	do {
		System.out.println("Guess my secret number. Its from 1 to 100");
		userNum=scan.nextInt();
	}while (userNum!=secretNum);
	}
	
	}


