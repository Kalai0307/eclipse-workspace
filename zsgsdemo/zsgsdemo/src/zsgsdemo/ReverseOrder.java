package zsgsdemo;

import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int sum=0;
	 while(n>0)
	 {
		int rem =n%10 ;
		sum =sum*10+rem;
		n=n/10;
		
	 }
	 System.out.println(sum);
	 }
	

}
