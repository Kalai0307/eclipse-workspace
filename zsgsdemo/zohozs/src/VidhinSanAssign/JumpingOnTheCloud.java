package VidhinSanAssign;

public class JumpingOnTheCloud {

	private static final boolean True = false;

	public static void main(String[] args) {
		
		int c[]= {1,1,1,0,1,1,0,0,0,0};
		int n = c.length;
		System.out.println(n);
		int energy=100;
		int k=3;
		int pos=0;
		int i=0;
			
		do {
	       energy -= (c[i] == 1) ? 3 : 1;
	       i = (i + k) % c.length;
	    } while(i!=0) ;
	    
	    	System.out.println(energy);
	    	
		//int m=0;
//		for(int i=0;i<n;i=i+k)
//		{
//		 energy=a[i]==0?energy-1:energy-3;
//		 m++;
//		 if(m==n-1)
//		 {
//			 i=m-n+3;
//		 }
//			
//		}
//		System.out.println(energy);

	}

}
