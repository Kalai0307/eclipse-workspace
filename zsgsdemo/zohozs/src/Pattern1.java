
public class Pattern1 {

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int m=5;
		
		
		 for(int j=1;j<=n;j++)
		 {
			 for(int k=1;k<=m;k++)
			 {
				 if(j==1||j==n||k==1||k==m)
				 {
					 System.out.print("x");
				 }
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
			 
		 }
	
	}

}
