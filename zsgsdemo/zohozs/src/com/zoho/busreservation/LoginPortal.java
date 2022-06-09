package com.zoho.busreservation;

import java.util.HashMap;
import java.util.Scanner;

public class LoginPortal  {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginDetails details= new LoginDetails();
		System.out.println("WELCOME TO ZOHO TRAVELS");
		
		System.out.println("please enter your user name and password");
		String name=sc.nextLine();
		System.out.println("User Name :"+name);
		String password=sc.nextLine();
		System.out.println("User password :"+password);
		details.setUsername(name);
		details.setUserpassword(password);
		LoginChecking.checking(name,password);
		
				

	}

}
