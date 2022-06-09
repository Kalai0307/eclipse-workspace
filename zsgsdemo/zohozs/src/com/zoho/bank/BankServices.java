package com.zoho.bank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class BankServices {
	static Scanner sc = new Scanner(System.in);
	 static  int recamount;
	 

	static	 HashMap<Integer,BankDetails> hm = new  HashMap<Integer,BankDetails>(){{
			 put(1,new BankDetails(1,"kalai",10101010,1111,12000));
			 put(2,new BankDetails(2,"vani",20202020,2222,12));
			 put(3,new BankDetails(3,"mini",30303030,3333,10));
			 put(4,new BankDetails(4,"sai",40404040,4444,100));
		 }};
		
		
	
	public void createAccount() {
		int  id=hm.size()+1;
		int accnum=50505050;
		
		int accountNum=accnum++;
		BankDetails details=  new BankDetails();
		System.out.println("ENTER YOUR NAME");
		String name=sc.next();
		details.setCustomerName(name);
		System.out.println("ENTER YOUR AADHAR NO");
		long aadhar=sc.nextLong();
		System.out.println("ENTER YOUR PHONE NUMBER");
		long ph=sc.nextLong();
		System.out.println(" your id is"+id);
		details.setId(id);
		details.setAccountNo(accountNum);
		System.out.println("your account number :"+accountNum);
		
	    System.out.println("PLEASE GENERATE YOUR PIN NUMBER");
	    int pin=sc.nextInt();
	    details.setBalance(0);
	    details.setPinNum(pin);
	    
	   
	    hm.put(id, details);
	    System.out.println(hm);
	    System.out.println("YOUR ACCOUNT IS SUCCESSFULLY GENENRATED");
	    
	    
	
	}



	public boolean chkAcccountAndPin(Integer accountNumber, Integer pinNumber) {
			

	    for (Map.Entry<Integer, BankDetails> m : hm.entrySet())
	    {
	    	
	    	
	    	BankDetails bTrans=m.getValue();
	    	System.out.println(bTrans.getAccountNo());
	    	if(accountNumber==(bTrans.getAccountNo()))
	    		
	    	{
	    		if(pinNumber==(bTrans.getPinNum()))
	    		{
	    			System.out.println("YOUR ACCOUNT IS VERIFIED,REDIRECTING TO TRANSACTIONS....");
	    			return true;
	    			
	    			
	    		}
	    		else
	    		{
	    			System.out.println("PLEASE ENTER THE CORRECT ACCOUNT NUMBER OR PIN NUMBER!!!!");
	    			break;
	    		}
	    		
	    	}
	    	
	    }
	   
	    boolean check=false;
	    return check;
		
		
		
	}



	public void balanceCheck(int accountnum,int result) {
		for (Map.Entry<Integer,BankDetails > m : hm.entrySet()) {
			BankDetails bTrans=m.getValue();
			if (accountnum==(bTrans.getAccountNo()))
			{
				bTrans.setBalance(bTrans.getBalance()-result);
				System.out.println("YOUR BALANCE IS :"+(bTrans.getBalance()));
				
				break;
			}
		}
		
		
		
	}



	public void depositAmount(int accountnum) {
		System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
		int amount= sc.nextInt();
		for (Map.Entry<Integer,BankDetails > m : hm.entrySet()) {
			BankDetails bTrans=m.getValue();
			if (accountnum==(bTrans.getAccountNo()))
			{
				int AmountDeposied= amount+bTrans.getBalance();
				
				bTrans.setBalance(AmountDeposied);
			System.out.println("YOUR REMAINING BALANCE IS :"+bTrans.getBalance());
				
				break;
			}
		}
	}



	public void amountWithdrawn(int accountnum) {
		System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN");
		int amount= sc.nextInt();
		for (Map.Entry<Integer,BankDetails > m : hm.entrySet()) {
			BankDetails bTrans=m.getValue();
			if (accountnum==(bTrans.getAccountNo()))
			{
				if(amount>bTrans.getBalance())
				{
					System.out.println("YOUR ACCOUNT BALANCE IS INSUFFICIENT TO MAKE TRANSACTION");
					break;
				}
				int AmountDeposied= bTrans.getBalance()-amount;
				bTrans.setBalance(AmountDeposied);
				System.out.println("YOUR REMAINING BALANCE IS :"+bTrans.getBalance());
				break;
			}
		
	}
		
		
	}



	public void sendMoney(int  accountNumber) {
		
		boolean senderCheckFlag = true;
		int amountInAccount=0;
		for(Map.Entry<Integer, BankDetails> individualUserdetails: hm.entrySet()) {
			BankDetails bTrans = individualUserdetails.getValue();
			
			if(accountNumber == bTrans.getAccountNo()) {
				amountInAccount=bTrans.getBalance();
				senderCheckFlag = true;
				break;
			} else {
				senderCheckFlag = false;
			}
		}
		
		if(senderCheckFlag) {
			System.out.println("Enter receiver account number: ");
			long recevierAccountNumber = sc.nextLong();
			boolean recevierCheckFlag = true;
			
			for(Map.Entry<Integer, BankDetails> individualdetails: hm.entrySet()) {
				BankDetails bankTransaction = individualdetails.getValue();
				
				if(recevierAccountNumber == bankTransaction.getAccountNo()) {
					recevierCheckFlag = true;
					if(recevierCheckFlag)
					{
						System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
						recamount=sc.nextInt();
						
						
						System.out.println(" THE AMOUNT "+ recamount+" IS DEBITED FROM YOUR ACCOUNT");
						balanceCheck( accountNumber,recamount);
						
					}
					
					
					break;
				}
				//System.out.println("YOUR BALANCE IS "+bTrans.);
			}
			
			
		}
		else
		{
			System.out.println("SORRY, RECEIPIENT ACCOUNT NUMBER IS NOT FOUND");
		}
	}

	

	
}
