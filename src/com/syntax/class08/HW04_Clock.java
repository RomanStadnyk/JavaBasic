package com.syntax.class08;

public class HW04_Clock {

	public static void main(String[] args) {
		// Complete clock assignment
		
		for (int hrs=0;hrs<=23; hrs++) {
			for (int min=0; min<=59; min++) {
				if (hrs<10 && min<10) {
				System.out.println("0"+hrs+":0"+min);
				} else if (hrs>=10 && min<10){
				System.out.println(hrs+":0"+min);
				} else if (hrs<10 && min>=10) {
					System.out.println("0"+hrs+":"+min);	
				}
				else {
					System.out.println(hrs+":"+min);
				}
			}
		}
	}
			

}
