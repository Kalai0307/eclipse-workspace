package com.zoho.bank;

import java.util.HashMap;

public class BankDetails {

	 private int id;
   private 	String customerName;
   private  long accountNo;
   private int pinNum;
   private int balance;
   
   
public BankDetails(int id, String customerName, long accountNo, int pinNum, int balance) {
	
	this.id = id;
	this.customerName = customerName;
	this.accountNo = accountNo;
	this.pinNum = pinNum;
	this.balance = balance;
}
BankDetails()
{
	
}

/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the customerName
 */
public String getCustomerName() {
	return customerName;
}
/**
 * @param customerName the customerName to set
 */
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
/**
 * @return the accountNo
 */
public long getAccountNo() {
	return accountNo;
}
/**
 * @param accountNo the accountNo to set
 */
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
/**
 * @return the pinNum
 */
public int getPinNum() {
	return pinNum;
}
/**
 * @param pinNum the pinNum to set
 */
public void setPinNum(int pinNum) {
	this.pinNum = pinNum;
}
/**
 * @return the balance
 */
public int getBalance() {
	return balance;
}
/**
 * @param balance the balance to set
 */
public void setBalance(int balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "[id=" + id + ", customerName=" + customerName + ", accountNo=" + accountNo + ", pinNum="
			+ pinNum + ", balance=" + balance + "]";
}
   
	
	
}
