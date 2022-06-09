import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a[]=new int [5];
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();		}
	
		int swap=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
					
				}
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}

		
	}

}
