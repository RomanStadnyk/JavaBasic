package com.syntax.class05;

import java.util.Scanner;

public class HW_02 {

	public static void main(String[] args) {
		// Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		//and determine the grade based on the following rules: 
		//if the average score >=90 → grade=A
		//if the average score >= 70 and <90 → grade=B
		//	if the average score>=50 and <70 → grade=C
		//	if the average score<50 → grade=F
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please, enter your quiz score");
		int quizScore=scan.nextInt();
		System.out.println("Please, enter your mid term score");
		int midTermScore=scan.nextInt();
		System.out.println("Please, enter your final score");
		int finalScore=scan.nextInt();
		
		int avarageScore=(quizScore+midTermScore+finalScore)/3;
		String grade;
		
		if (avarageScore>=90) {
			grade="A";
		} else if (avarageScore>=70 && avarageScore<90) {
			grade="B";
		}else if (avarageScore>=50 && avarageScore<70) {
			grade="C";
		}else if (avarageScore<50) {
			grade="F";
		}else {
			grade="unable to be calculated";
		}
		
		System.out.println("Your grade is "+grade);
	}

}
