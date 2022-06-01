import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[]=new int [5];
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();		
		}
	
		int temp=a[0];

	for(int i=0;i<5;i++)
	{
		for(int j=i+1;j<5;j++)
		{
		if(a[i]>a[j])
		{
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;		}
		}
	}
	for(int i=0;i<5;i++)
	{
		System.out.print(a[i]);}
	}
}
