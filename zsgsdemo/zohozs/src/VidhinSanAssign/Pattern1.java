package VidhinSanAssign;
/*
 *      *
 *    *   *
 *  *   *   *  
 *    *   *
 *      *
 * 
 * 
 * 
 */
public class Pattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("`");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int m=1;m<n;m++)
		{
			for(int l=0;l<=m;l++)
			{
				System.out.print("`");
			}
			for(int o=n-m;o>=1;o--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		

	}

}
