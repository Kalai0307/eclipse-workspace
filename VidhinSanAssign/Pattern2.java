package VidhinSanAssign;
// hollow dimaond pattern
public class Pattern2 {

	public static void main(String[] args) {
	int n =5,j;
	String s= "racecar";
		for(int i=0;i<n;i++)
		{
			for( j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++)
			{
				if(k==0||k==i*2)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n*2-i-2;k++)
			{
				if(k==i || k==n*2-i-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
	}
		
	}


