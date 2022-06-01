import java.util.Scanner;

public class AdditionMtrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int a[][]=new int [r1][c1];
		int b[][]=new int [r2][c2];
		int c[][]=new int [r1][c1];
		System.out.println("matrix1");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix2");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("adding elements");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
sc.close();
	}

}
