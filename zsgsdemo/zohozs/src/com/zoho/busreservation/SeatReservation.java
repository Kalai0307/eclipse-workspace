package com.zoho.busreservation;

import java.util.Scanner;

public class SeatReservation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" BUS SEAT RESERVATION");
		System.out.println("PLEASE CHOOSE ONE SEAT");
		int n=sc.nextInt();
		 int p= '*';
		 int seat=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j%4==0)
				{
					System.out.print("   ");
					
					  
					  seat--;
				}
				
				else
				{
					System.out.print(seat+" ");
					if(n==seat &&p!='k')
					{
						System.out.print('k');
					}
					else if((n==seat &&p=='k'))
					{
						System.out.println("please choose another seat");
					}
				}
			
				seat++;
					
			}
			System.out.println();
		}

	}

}
