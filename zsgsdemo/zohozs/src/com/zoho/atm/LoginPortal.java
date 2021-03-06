package com.zoho.atm;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class LoginPortal extends BankFacilities {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankDetails details = new BankDetails();
		System.out.println("WELCOME TO ZOHO ATM");
		
		while(true)
		{
			System.out.println("PRESS 1 : CREATE ACCOUNT");
			System.out.println("PRESS 2: ENTER YOUR ACCOUNT AND PIN NUMBER");
		byte choice = sc.nextByte();
		switch(choice){
		case 1:
			System.out.println("ENTER YOUR NAME");
			String name=sc.next();
			System.out.println("ENTER YOUR AGE");
			int age=sc.nextInt();
			System.out.println("ENTER YOUR AADHAR NO");
			long aadhar=sc.nextLong();
			new BankFacilities().createAccount();
			break;
		case 2:
		{HashMap<Integer, Integer> userAccountAndPin = new HashMap<Integer, Integer>();
			userAccountAndPin.put(10101010, 1111);
			userAccountAndPin.put(20202020, 2222);
			userAccountAndPin.put(30303030, 3333);
			userAccountAndPin.put(40404040, 4444);
			userAccountAndPin.put(50505050, 5555);
			System.out.println("Enter your Account Number");
			Integer accountNumber = sc.nextInt();
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
						chooseOption(accountNumber);
						break;
					} else {
						System.out.println(" Please enter the correct account and pin number");
						break;
					}
				}

			}
			break;
		}
			

		}

	}

}

public static void chooseOption(int accountNumber) {
	Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a choice");
		while (true) {
			System.out.println("=================================");
			System.out.println(" ");
			System.out.println("PRESS 1 : BALANACE CHECK");
			System.out.println("PRESS 2 : DEPOSIT AMOUNT");
			System.out.println("PRESS 3 : WITHDRAW AMOUNT ");
		   
			System.out.println("PRESS 4 : EXIT");
			System.out.println("=================================");
			int option = sc.nextInt();
			switch (option) {
			case 1:

				BankFacilities.balanceCheck(accountNumber);
				System.out.println("your balance is " + details.getBalance());
				break;

			case 2:

				System.out.println("enter the amount to  deposited");
				int amount = sc.nextInt();
				BankFacilities.depositAmount(accountNumber, amount);
				break;

			case 3:

				System.out.println("enter the amount to  withdrawn");
				int withdrawnAmount = sc.nextInt();

				BankFacilities.amountWithdrawn( withdrawnAmount);
				break;
			
				
			
			case 4:
				System.out.println("THANKS FOR USING ZOHO BANK");
               System.exit(0);
               
			}

		}

	}

	
		
	}

