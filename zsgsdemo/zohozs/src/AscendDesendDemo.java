import java.util.Arrays;
import java.util.Scanner;

public class AscendDesendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("number of element");
		int n= sc.nextInt();
		
		int a[]=new int [n];
		
		int d[]=new int [n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();	
		}
		int size;
		if(n%2==0)
		{
			 size=n/2;
		}
		else
		{
		 size=(n/2)+1;
		}
		int size2=size+1;
		int b[]=new int[size];
		int c[]=new int [size2];
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	int temp;
	int g=0;
		for(int i=0;i<n;i++)
		{
			if(i<size)
			{
				b[i]=a[i];
			}
			else
				{
				c[g]=a[i];
				g++;
				//System.out.println(c[g]);
				}
		}
	//	System.out.println(Arrays.toString(b));	
	//	System.out.println(Arrays.toString(c));	
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(b[i]<b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
			}
		}
		
		}	
		//	System.out.println(Arrays.toString(b));	
			//index to start with 0 we initialise
			 int e=0;
			  int f=0;
			for(int p=0;p<n;p++)
			{  
			
				if(p%2==0)
				{
				d[p]=b[e]	;
				e++;	
				}
				else
				{
					d[p]=c[f];
					f++;
				}	
				
				}
			
			
		
		System.out.println(Arrays.toString(d));	
	}

}
