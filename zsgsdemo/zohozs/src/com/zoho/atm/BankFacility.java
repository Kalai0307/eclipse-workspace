package com.zoho.atm;


import java.util.HashMap;
import java.util.Map.Entry;

public class BankFacility {
	static PersonalDetails details = new PersonalDetails();

	public static void main(String args[]) {}


	public static int balanceCheck(int accountNumber) {
		HashMap<Integer, Integer> balance = new HashMap<Integer, Integer>();

		balance.put(1010, 11);
		balance.put(2020, 22);
		balance.put(3030, 33);
		balance.put(4040, 44);
		balance.put(5050, 55);
		int accountBalance = 0;
		for (Entry<Integer, Integer> m : balance.entrySet()) {

			if (m.getKey() == accountNumber) {
				accountBalance = m.getValue();

				break;
			}
		}
		details.setBalance(accountBalance);
		return accountBalance;

	}

	public static void depositAmount(int accountNumber, int amount) {
		HashMap<Integer, Integer> balance = new HashMap<Integer, Integer>();

		balance.put(1010, 11);
		balance.put(2020, 22);
		balance.put(3030, 33);
		balance.put(4040, 44);
		balance.put(5050, 55);
		System.out.println(" Before credited your balance is= " + details.getBalance());
		for (Entry<Integer, Integer> m : balance.entrySet()) {

			if (m.getKey().equals(accountNumber)) {
				int balanceamount = amount + m.getValue();
				int bal = details.setBalance(balanceamount);
				
				System.out.println("Amount is  credited to your account");
				System.out.println("your balance is = " + bal);

				break;
			}
		}

	}

	public static void amountWithdrawn(int withdrawnAmount) {

		if (withdrawnAmount > details.getBalance()) {
			System.out.println("your available balance is insuffcient");
			System.out.println("your balance is =" + details.getBalance());
		} else {
			System.out.println("your balance before withdrawn is =" + details.getBalance());
			int balance = details.getBalance() - withdrawnAmount;
			int bal = details.setBalance(balance);
			System.out.println("your balance after withdrawn is =" + bal);
		}

	}

}
