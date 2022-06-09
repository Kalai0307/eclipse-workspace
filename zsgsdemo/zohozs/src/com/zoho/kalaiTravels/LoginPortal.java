package com.zoho.kalaiTravels;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPortal {

	public static void main(String[] args) {
		BusDetails  busdetails= new BusDetails();
		ArrayList< Integer> seat = new ArrayList<>(52);
		
		for(int i=1;i<=5;i++)
		{
			seat.add(i);
		}
		int noofbookedseat=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO KALAI TRAVELS");
		System.out.println("      HAPPY  JOURNEY     ");
		
		int TotalSeatCount=5;
		
		 busdetails.setNoOfSeatsAvailable(TotalSeatCount);
	
		int noOfSeatsAvailable1= busdetails.getNoOfSeatsAvailable();
	     System.out.println("number of availabe seats"+noOfSeatsAvailable1);
	     System.out.println(" departure from : THIRUCHENDUR");
	     System.out.println(" arrival to : CHENNAI");
	     
	     while(true)
	     {
	    	 System.out.println("Press 1 : For seats availability");
	    	 System.out.println("Press 2 : For booking seats");
	    	 System.out.println("Press 3 : For  cancel tickets ");
	    	 System.out.println("Press 4 : For  exit ");
	    	 
	    	 System.out.println(" please enter one choice"); 
	    	 int choice = sc.nextInt();
	    	 switch(choice)
	    	 {
	    	 
	    	 case 1:
	    	 {
	    		SeatReservation.seatAvailablity(seat,noofbookedseat);
	    		 break;
	    	 }
	    	 case 2:
	    	 {
					System.out.println(" enter number seats you want to book");
					int count = sc.nextInt();

					if (count > busdetails.setNoOfSeatsAvailable(TotalSeatCount)) {
						System.out.println("Sorry we have not enough seats");
						System.out.println("The only available  seats are: " + noOfSeatsAvailable1);
					} else {
						int j = noOfSeatsAvailable1;
						for (int i = 0; i < count; i++) {

							System.out.println("Please enter the  seat number");
							int bookingseat = sc.nextInt();

							int bookedCount = SeatReservation.seatAvailabilityChecking(bookingseat, seat, j,noofbookedseat);
							busdetails.setBookedSeat(bookedCount);

							if (bookedCount == j) {

								System.out.println(" Sorry,This seat is alreday booked ,Please choose another one");
								i--;

							} else {
								j = bookedCount;
							}

						}
					}
			
	    	 }
	    	 break;
	    	 
	    	 case 3:
	    	 {
	    		 System.out.println(seat);
	    		 CancelTicket.cancellation(seat);
	    	 }
	    	 case 4:
	    	 {
	    		 System.out.println("your seats are booked");
		    	  System.out.println("THANKS FOR CHOOSING US");
	    		 System.exit(choice);
	    	 }
	    	  
	    	  
	     } 
	    	
	     }	  
	    	  
	    	  
	}   	  
	}
	

	



