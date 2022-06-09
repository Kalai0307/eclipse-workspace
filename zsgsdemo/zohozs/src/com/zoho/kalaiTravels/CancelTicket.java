package com.zoho.kalaiTravels;

import java.util.ArrayList;
import java.util.Scanner;

public class CancelTicket {

	public static void cancellation(ArrayList<Integer> seat) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("please enter the seat number to be cancelled");
		
		int cancelticket=sc.nextInt();
		for(int i=0;i<seat.size();i++)
		{
			if(seat.get(i).equals(cancelticket))
			{
				seat.add(i, 1);
				System.out.println(seat);
			}
		}
	}

}
