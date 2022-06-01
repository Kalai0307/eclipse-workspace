import java.util.Scanner;

public class RightAngleRotationMtrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int a[][]=new int [row][col];
		int b[][]=new int [row][col];
		System.out.println("matrix1");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix2");
		for(int i=0;i<row;i++)
		{
			for(int j=col-1;j>=0;j--)
			{
				
				b[i][j]=a[i][j];
			}
		}
		System.out.println("after right rotation");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}		

	}

}
