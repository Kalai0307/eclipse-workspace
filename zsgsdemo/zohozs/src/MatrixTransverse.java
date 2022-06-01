import java.util.Scanner;

public class MatrixTransverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		
		int a[][]=new int [r1][c1];
		int b[][]=new int [c1][r1];
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
				b[i][j]=a[j][i];
			}
		}
		System.out.println("after transpose");
		for(int i=0;i<c1;i++)
		{
			for(int j=0;j<r1;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
