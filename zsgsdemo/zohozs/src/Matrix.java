import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		int c1=sc.nextInt();
		int c2=sc.nextInt();
		
		int a[][]=new int [r1][c1];
		int b[][]=new int [r2][c2];
		int c[][]=new int [r1][c2];
		System.out.println("matrix 1");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();	
				}
		    }
	    
		for(int l=0;l<r2;l++)
		{
			for(int s=0;s<c2;s++)
			{
				
				b[l][s]=sc.nextInt();		
				}
	      	}
   
		if(c1==r2)
		{
			
			int sum =0;
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
				for(int k=0;k<r2;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
				sum=0;
				}
				
			}
		}
		else
		{
			System.out.println("the matrix multiplication cannot be executed");
		}
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\n");
		}

	}

}
