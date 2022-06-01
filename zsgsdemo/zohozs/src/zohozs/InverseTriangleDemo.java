package zohozs;

import java.util.Scanner;

public class InverseTriangleDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("~");
			}
			for(int k=i;k<n;k++)// odd= n*2-i-1 k=k+2
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
sc.close();
	}

}
