package com.zoho.kalaiTravels;

import java.util.ArrayList;

public class SeatReservation {
static 	BusDetails busdetails = new BusDetails();
	public static int seatAvailabilityChecking(int bookingseat, ArrayList<Integer> seat, int noOfSeatsAvailable, int noofbookedseat) {
		

		
		int p = 0;
		for (int i = 0; i < seat.size(); i++) {

			if (seat.get(i).equals(bookingseat)) {
				if (!seat.get(i).equals(0)) {
					seat.set(i, 0);
					System.out.println("your seat no "+( i+1)+" is  succesfully booked");
					--noOfSeatsAvailable;

					System.out.println("remaing seats"+noOfSeatsAvailable);
					busdetails.setBookedSeat(noOfSeatsAvailable);
					p = busdetails.getBookedSeat();
					
                     noofbookedseat++;
					break;

				}
			} else {
				p = noOfSeatsAvailable;

			}

		}

		return p;

	}

	public static void seatAvailablity(ArrayList<Integer> seat, int noofbookedseat) {
		
		System.out.println( seat.size()-noofbookedseat);
	}

}
