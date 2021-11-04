package com.syntax.class11;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human Roman=new Human();
		Roman.name="Roman";
		Roman.age=38;
		Roman.gender='M';
		Roman.bloodType="A-";
		
		Roman.eat();
		Roman.sleep();
		Roman.walk();
		
		Human bogadna=new Human();
		bogadna.name="Bohdana Smyrnova";
		bogadna.age=21;
		bogadna.height=5.8;
		bogadna.gender='F';
		bogadna.bloodType="B-";
		
		bogadna.eat();
		bogadna.sleep();
		bogadna.sendLove();
		bogadna.walk();
		
		
	}

}
