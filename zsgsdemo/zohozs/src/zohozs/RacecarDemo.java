package zohozs;

import java.util.Scanner;

public class RacecarDemo {

	public static void main(String[] args) {
	
		String s="racecar";
		int n= s.length();
		System.out.println(n);
		System.out.println(s.charAt(n/2));
		for(int i=0;i<=n/2;i++)
		{
			for(int j=i;j<=n/2;j++)
			{
				System.out.print("`");
			}
			for(int k=0;k<=2*i;k++)
			{
				if(k==0)
				{
					System.out.print(s.charAt((n/2)-i));
				}
			    if(k==2*i-1)
				{
					System.out.print(s.charAt((n/2)+i));
					
				}
				else
					System.out.print("`");
			}
			
			System.out.println();
		}
		
		
	
//		for(int i=1;i<n/2;i++)
//		{
//			for(int j=1;j>=i;j++)
//			{
//			  	System.out.print("`");
//			}
//			for(int k=i;k<=n/2;k++)
//			{
//				if(k==i)
//				{
//					System.out.print(s.charAt(i));
//				}
//				if(k==n/2)
//				{
//					System.out.print(s.charAt(n-1-i));
//				}
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
	
		}
 
}
 
 

