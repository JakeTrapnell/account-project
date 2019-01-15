package com.qa.AccountApp;


public class Account {
	
	private String firstName;
	private String lastName;
	private int accountNum;
	
	public Account(String firstName, String lastName, int accountNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNum = accountNum;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	
	

}
