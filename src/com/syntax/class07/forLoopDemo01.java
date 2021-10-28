package com.syntax.class07;

public class forLoopDemo01 {
	public static void main(String[] args) {
		//Print odd numbers between 20 and 50 (2 ways)
		
		//first way
		for (int i=20; i<=50; i++) {
			if(i%2!=0) {
			System.out.println(i);}
		}
		// second way
		for (int i=21; i<=50; i+=2) {
			
			System.out.println(i);
		}
	}
	
	

}
