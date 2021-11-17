package com.syntax.homework.class18;

public class Teacher {
	
	String name;
	char sex;
	int age;
	
	void teaching() {
		System.out.println(name+" is teaching you as well.");
	}
	void presentation() {
		System.out.println("Teacher name is "+name);
		if(sex=='f'||sex=='F') {
			System.out.println("She is "+age);
		}else if(sex=='m'||sex=='M') {
			System.out.println("He is "+age);
		}
	}
	
}
