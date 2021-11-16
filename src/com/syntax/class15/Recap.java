package com.syntax.class15;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is Lubo. Lubo is a break manager";
		System.out.println(str.replace(" ","" ));
		
		String str2="dggkreaJUTklcbMNRPO17896$%#jk(0MR";
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));
		
		String str3=""; 
		//String is not recommended because every time it will search the memory and that will slow down code
		for(int i=0;i<5;i++){
			str3=str3+i;}
		
		System.out.println(str3);
		//when you have to change the value of the String variable always use the StringBuilder class
		StringBuilder  strBuilder=new StringBuilder(); 
		for(int i=0;i<5;i++){
			strBuilder.append(i);
			}
		System.out.println(strBuilder);
		
		StringBuilder strBuilder1=new StringBuilder();
		
	}

}
