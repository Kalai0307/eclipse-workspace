

import java.util.Scanner;

public class TriangleDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");// odd :k=i*2
			}
			System.out.println("\n");
		}
sc.close();
	}

}
