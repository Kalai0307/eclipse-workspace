package VidhinSanAssign;

public class Pattern6 {

	public static void main(String[] args) {
		 int  alpha=65;
		 int n=5;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i;j<n;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=0;k<=i;k++)
			 {
				 System.out.print((char)(alpha+i)+" ");
			 }
			 System.out.println();
		 }
		 
		 for(int i=1;i<n;i++)
		 {
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=i;k<n;k++)
			 {
				 System.out.print( (char)(alpha-i+n-1)+" ");
			 }
			 System.out.println();
		 }
		 

	}

}
