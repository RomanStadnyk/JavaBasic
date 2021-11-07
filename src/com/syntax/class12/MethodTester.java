package com.syntax.class12;

public class MethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Line before");
		Methods methods=new Methods();
		methods.sayHello();
		System.out.println("line after");
		
		methods.sayHelloManyTimesParameter(10);
	}

}
