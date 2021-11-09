package com.syntax.class13;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo01 obj=new MethodDemo01();
		MethodDemo02 object=new MethodDemo02();
		obj.add(10, 10);
		System.out.println(obj.add(10, 10));
		
		int[] array= {10, 10, 10};
		
		array=obj.doubleArray(array);
		
		System.out.println(Arrays.toString(array));
		System.out.println("********************");
		
		int[] arr= {10, 20, 30};
		object.printArray(arr);
	}

}
