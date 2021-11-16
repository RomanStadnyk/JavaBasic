package com.syntax.class16;

public class Account {
	
	private String userName;
	private String password;
	private String name;
	private String adress;
	private int age;
	private double accountBalance;
	

	
	public void setUserName(String AccountuserName) {
		if (AccountuserName.length()<16) {
			userName=AccountuserName;
		} else {
			System.out.println("Length of Username is too short");
		}
		userName=AccountuserName;
	}
	
	
	public void getBalance(String AccountuserName, String accountPassword) {
		if(userName.equals(AccountuserName)&& password.equals(accountPassword)){
			System.out.println(accountBalance);
			} else {
				System.out.println("no");
			}
	}

}
