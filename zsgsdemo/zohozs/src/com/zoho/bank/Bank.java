package com.zoho.bank;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

import com.zoho.atm.BankDetails;
import com.zoho.atm.BankFacilities;

public class Bank {
	 static Scanner sc = new Scanner(System.in);
	 static  BankServices t = new BankServices();
	public static void main(String[] args) {
		
		
		BankDetails detals = new BankDetails();
		System.out.println("WELCOME TO ZOHO BANK");
		while (true) {
			System.out.println("PRESS 1 : CREATE ACCOUNT");
			System.out.println("PRESS 2 : BANKING SERVICES ");
			byte choice = sc.nextByte();
			switch (choice) {
			case 1:
				
				t.createAccount();

			case 2:
				System.out.println("Enter your Account Number");
				Integer accountNumber = sc.nextInt();
				System.out.println("Enter your Pin Number");
				Integer pinNumber = sc.nextInt();
				System.out.println("your account is" + accountNumber);
				boolean checking=t.chkAcccountAndPin(accountNumber,pinNumber);
				if(checking==true)
			    chooseOption(accountNumber);
				else
					System.out.println("PLEASE ENTER CORRECT ACCOUNT NUMBER");
				break;
				

			}
		}

	}

	public static void chooseOption(Integer accountNumber) {
		

		System.out.println("Please enter a choice");
		
		while (true) {
			System.out.println("=================================");
			System.out.println("         MENU            ");
			System.out.println("PRESS 1 : BALANACE CHECK");
			System.out.println("PRESS 2 : DEPOSIT AMOUNT");
			System.out.println("PRESS 3 : WITHDRAW AMOUNT ");
			System.out.println("PRESS 4 : SEND MONEY");
			System.out.println("PRESS 5 : EXIT");
			System.out.println("=================================");
			int option = sc.nextInt();
			
			switch (option) {
			
			case 1:
                
				t.balanceCheck(accountNumber,0);
				
				break;

			case 2:

				
				t.depositAmount(accountNumber);
				break;

			case 3:

				

				t.amountWithdrawn( accountNumber);
				break;
			
			case 4:	    		
		     	t.sendMoney(accountNumber);
			
			case 5:
				System.out.println("THANKS FOR USING ZOHO BANK");
               System.exit(0);
               
			}
			
			}
		
	}

}
