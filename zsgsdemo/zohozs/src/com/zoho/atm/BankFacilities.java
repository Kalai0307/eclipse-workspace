package com.zoho.atm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
public class BankFacilities {


	static BankDetails details = new BankDetails();
	static int accountNumber=50505050;
	


	public static int balanceCheck(int accountNumber) {
		HashMap<Integer, Integer> balance = new HashMap<Integer, Integer>();

		
		balance.put(10101010, 11);
		balance.put(20202020, 22);
		balance.put(30303030, 33);
		balance.put(40404040, 44);
		balance.put(50505050, 55);
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

		balance.put(10101010, 11);
		balance.put(20202020, 22);
		balance.put(30303030, 33);
		balance.put(40404040, 44);
		balance.put(50505050, 55);
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

	


	public  void createAccount() {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> userAccountAndPin = new HashMap<Integer, Integer>();
		userAccountAndPin.put(10101010, 1111);
		userAccountAndPin.put(20202020, 2222);
		userAccountAndPin.put(30303030, 3333);
		userAccountAndPin.put(40404040, 4444);
		userAccountAndPin.put(50505050, 5555);
		 BankDetails details= new BankDetails();
		accountNumber++;
		 
		 details.setAccountNumber(accountNumber);
		 System.out.println("your account number:"+accountNumber);
		 System.out.println("Create your  4 digit PinNumber");
		 int pin=sc.nextInt();
		 if(pin>999&& pin<=9999)
		 {
			 
			System.out.println("Your pin is succesfully Created"); 
		 }
		 else
		 {
			System.out.println("Please generate the pin correctly"); 
			System.out.println("Create your  4 digit PinNumber");
			pin=sc.nextInt();
			
		 }
		 
		 userAccountAndPin.put(accountNumber, pin);
		 for (Entry<Integer, Integer> m : userAccountAndPin.entrySet()) {

				System.out.println(m.getKey()+" "+m.getValue());
				}

			
		
	}

	public static void accountandPinCheck() {
		Scanner sc = new Scanner(System.in);
	
		HashMap<Integer, Integer> userAccountAndPin = new HashMap<Integer, Integer>();
		userAccountAndPin.put(10101010, 1111);
		userAccountAndPin.put(20202020, 2222);
		userAccountAndPin.put(30303030, 3333);
		userAccountAndPin.put(40404040, 4444);
		userAccountAndPin.put(50505050, 5555);
		System.out.println("Enter your Account Number");
		Integer accountNumber1 = sc.nextInt();
		System.out.println("Enter your Pin Number");
		Integer pinNumber = sc.nextInt();
		details.setAccountNumber(accountNumber);
		details.setPinNumber1(pinNumber);
		System.out.println("your account" + accountNumber);

		
		for (Entry<Integer, Integer> m : userAccountAndPin.entrySet()) 
		{   System.out.println(m.getKey());

			if (m.getKey().equals(accountNumber)) 
			{
				if (m.getValue().equals(pinNumber)) 
				{
					 LoginPortal. chooseOption(accountNumber);
					break;
				} else {
					System.out.println(" Please enter the correct account and pin number");
					break;
				}
			}

		
	}
    
}

	
}



