package zsgsdemo;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;
class Sorting
{int n=7;
	int b[]=new int [n/2];
int c[]=new int [n/2];

	
	public void method(int[] a,int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				
				b[i]=a[i];
			}
			else
			{
				
				c[i]=a[i];
			}
				
		}
		for(int k=0;k<b.length;k++)
		{
			System.out.println(b[k]);
		}
			
	}
}

public class ListTrial {

	  public static void main(String[] args) {
	        
	      Scanner scan= new Scanner(System.in);
	      int n=7;
	      int a[]=new int [n];
	      	      for(int i=0;i<a.length;i++)
	      {
	    	 a[i]=scan.nextInt(); 
	      }
	      Sorting obj=new Sorting();
	      obj.method(a,n);
	        
	       scan.close(); 
	  }
	        
}