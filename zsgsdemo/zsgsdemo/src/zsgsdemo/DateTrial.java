package zsgsdemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTrial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s= sc.nextLine();
		DateFormat in = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat out = new SimpleDateFormat("HH.mm.ss");
		Date n;
		String mydate;
		try {
			n=in.parse(s);
			mydate=out.format(n);
			System.out.println(mydate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		sc.close();
		

	
}
Scanner scan =new Scanner(System.in);
int n =scan.nextInt();
int[] a=new int [n]; 
for(int p=0;p<n;p++)
{
   a[p]=scan.nextInt();
}
int count=0;
for(int i=0;i<n;i++)
{int m=a[i];
   while(m%5!=0)
   {
       count++;
       m++;
   } 
   if(count<3&&(m%5==0)&&m>=40)
   {
       System.out.println(m);
   }
   else if(count>=3)
   {
       System.out.println(a[i]);
   }
   else if(a[i]<35)
   {
       System.out.println(a[i]);
   }
   count=0;
}


}    
}
