package VidhinSanAssign;
//     1 
//    1 2 
//   1 2 3 
//  1 2 3 4 
// 1 2 3 4 5 
public class Pattern_4 {

	public static void main(String[] args) {
		
	        for(int i=1;i<=5;i++)
			{
				for(int j=i;j<=5;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k+" ");
				
				}
				System.out.println();
	    }

	}

}
