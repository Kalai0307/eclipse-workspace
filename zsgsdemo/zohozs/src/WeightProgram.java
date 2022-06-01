import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WeightProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number of element");
		int n = sc.nextInt();
		int c[]=new int [n];
		int a[]=new int [n];
		for(int i=0;i<n;i++)
			{
			a[i]=sc.nextInt();	
			}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++)
		{ int k= a[i];
		//	weight();
			c[i]=weight(k);
		}
		System.out.print("weights are: ");
	//	Arrays.sort(c);
		int temp=0;
		int temp2=0;
		for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)	
		{
			if(c[i]<c[j])
			{
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				temp2=a[i];
				a[i]=a[j];
				a[j]=temp2;
				
			}
			
		}
		System.out.println("<"+a[i]+","+c[i]+">");
		}
		//}for(int i =0;i<n;i++)
	
	//	System.out.println(Arrays.toString(c));
	//	
		sc.close();
    
	}

	private static int weight(int k) {
		// TODO Auto-generated method stub
		int count=0;
int s=(int)Math.sqrt(k);
		if(s*s==k)
		{
			count=count+5;
		}
		if(k%4==0&&k%6==0)
		{
			count=count+4;
		}
		if(k%2==0)
		{
			count=count+3;		}
		return count;
	}

}
