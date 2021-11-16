package com.syntax.class14;

public class StringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="afjkd123ADFG45sghlb345ngnflskhv11dg45JL;;6fdkhgashGVFDGFGcb123ddjvcdsvbkacb";
		System.out.println(str.replaceAll("[0-5]", "*"));
		System.out.println(str.replaceAll("[A-Ta-z]", "#"));
		System.out.println(str.replaceAll("[^a-z]", "*")); // replace all with * but [a-z]
		System.out.println(str.replaceAll("[a-z]", "")); // removes all symbols from a-z

	}

}
