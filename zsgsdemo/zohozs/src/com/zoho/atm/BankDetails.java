package com.zoho.atm;

import java.util.HashMap;

public class BankDetails {

	private int accountNumber;
	private int pinNumber;
	private int balance;
	private int customerName;
	private int customerAge;
	private long aadharNumber;
	private int newAccountNumber;
	
	
//	BankDetails()
//	{
//		customerAge=age;
//		customerName=name;
//		aadharNumber=aadhar;
//		
//	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public void setPinNumber1(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public int getBalance() {
		return balance;
	}

	public int setBalance(int balance) {
		return this.balance = balance;
	}
	public int getNewAccountNumber() {
		return newAccountNumber;
	}
	public void setNewAccountNumber(int newAccountNumber) {
		this.newAccountNumber = newAccountNumber;
	}

		
}