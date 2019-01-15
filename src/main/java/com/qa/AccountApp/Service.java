package com.qa.AccountApp;

import java.util.HashMap;

public class Service {

	int idNum = 0;
	HashMap<Integer, Account> map = new HashMap <Integer, Account>();

	public Service() {
	}

	public Account makeAccount(String firstName, String secondName, int accountNumber) {

		Account person = new Account(firstName, secondName, accountNumber);
		makeMap(person);
		return person;
	}

	public HashMap<Integer, Account> makeMap(Account person) {

		idNum = idNum + 1;
		map.put(idNum, person);
		return map;
	}
	
	public Account findbyId(int id, HashMap<?, ?> map) {
		
		return (Account) map.get(id);
	}

}
