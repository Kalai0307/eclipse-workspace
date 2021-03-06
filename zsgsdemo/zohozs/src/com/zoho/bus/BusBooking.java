package com.zoho.bus;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BusBooking {
	static TreeMap<Integer, Passenger> tm = new TreeMap<>();
	ArrayList<Integer> a= new ArrayList<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BusBooking busBooking = new BusBooking();
		Bus bus =new Bus();
		Passenger passenger = new Passenger();
		while (true) {
			displayMessage();
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				busBooking.bookTicket(bus);
				break;
			case 2:
				busBooking.viewBookedTicket(tm);
				break;
			case 3:
				busBooking.cancelTicket();
				break;
////			case 4:
////				busBooking.search();
////				break;
////			default:
//				exit();
			}
		}
	}

	private static void displayMessage() {
		System.out.println("Welcome to Kalai Travels");
		System.out.println("1.Ticket Booking");
		System.out.println("2.View Booked  Ticket");
		System.out.println("3.Cancel Ticket");

	}

	private static void exit() {

	}

	public void viewBookedTicket(TreeMap<Integer, Passenger> tm2) {
		 for(Map.Entry m:tm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue()); 
		 }

	}

	public void cancelTicket() {
		// TODO Auto-generated method stub

	}

	public void bookTicket(Bus bus) {
		Scanner sc = new Scanner(System.in);
	//	Bus bus =new Bus();
		Passenger passenger = new Passenger();
		
		while(true)
		{System.out.println("Press 1: for booking and check bus details and driver details");
		System.out.println("press 2:  for booking seats ");
			byte choice = sc.nextByte();
		//	System.out.println("enter choice :"+choice);
			switch(choice)
			{
			case 1:
			{//viewing bus details
				busDetails(bus);
				
				break;
			}
			case 2:
			{
				System.out.println("number of seats to be booked");
				int NoOfSeats=sc.nextInt();
				System.out.println(" no of seats="+NoOfSeats);
				int TotalSeats=5;////bus.getSeatCount();
			//	System.out.println("total seats="+TotalSeats);
				passengerDetail(passenger,NoOfSeats,TotalSeats);
			}
			case 3:
			{
				
			}
		}
		
		}

	}

	private void passengerDetail(Passenger passenger, int noOfSeats, int totalSeats) {
		
		{
			Scanner sc = new Scanner(System.in);
			// System.out.println("number seats you want to be booked");
			// int NoofSeats= sc.nextInt();
			if (noOfSeats > totalSeats) {
				System.out.println("you are exceeding the seat Limits");

				// tm.put(, passenger);
			} else {
				
				while (noOfSeats != 0) {
					System.out.println("choose one seat number");
				int seatNo = sc.nextInt();
				
				for (int i : a) {
					if (a.contains(seatNo)) {
						System.out.println("this seat is already booked choose another one ");
					} 
					else {a.add(seatNo);

							System.out.println("enter your name :");
							passenger.setName(sc.next());
							System.out.println("enter your age");
							passenger.setAge(sc.nextInt());
							System.out.println("enter your gender");
							String gender = sc.next();
							passenger.genderIsPresent(gender);
							// System.out.println(gender);
							System.out.println("eneter your phno");
							passenger.setPhno(sc.nextLong());
							System.out.println("eneter your boarding point");
								passenger.setBoardingPoint(sc.nextLine());
								System.out.println("eneter your destination point");
								passenger.setDestinationPoint(sc.nextLine());
							tm.put(seatNo, passenger);
						}
					}
					
					
				}
				
				noOfSeats--;
			}

		}

	}

	private void busDetails(Bus bus) {
		bus.setBusId("TK004");
		bus.setBusType("Semi-Sleeper");
		bus.setSeatCount(5);
		bus.setDriverName("SAI SABARI JEYANTH");
		bus.setPhno(9488034538l);
		System.out.println(bus.toString());

	}

}
