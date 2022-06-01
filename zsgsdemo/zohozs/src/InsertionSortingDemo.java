import java.util.Scanner;

public class InsertionSortingDemo {

	public static void main(String[] args) {
		int a[]= {15,3,7,4,9};
		Scanner sc= new Scanner(System.in);
		/*for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		}*/
		int temp;
		for(int i=1;i<5;i++)
		{int var=i;
			for(int j=i-1;j>=0;j--)
			{
				if(a[j]>a[var])
				{
					temp=a[var];
					a[var]=a[j];
					a[j]=temp;
					var--;
					
				}
				
			}
			
			
			//System.out.print(a[i]+" ");
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}

	}

}
