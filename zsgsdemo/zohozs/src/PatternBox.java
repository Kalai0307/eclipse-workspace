
public class PatternBox {

	/*
	 * 5555555
	 * 5444445
	 * 5433345
	 * 5432345
	 * 5433345
	 * 5444445
	 * 5555555
	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n=5;
	    
	    for(i=n; i>1; i--)//only diffrence from n-->1,i-->n
	    {
	        for(j=n;j>=1;j--)
	        {
	            if(j>i) 
	            	System.out.print(j);
	            else 
	            	System.out.print(i);
	        }
	        for(j=2;j<=n;j++)
	        {
	            if(j>i) 
	            	System.out.print(j);
	            else 
	            	System.out.print(i);
	        }
	        System.out.println();	   
	        }   
	    for(i=1; i<=n; i++)
	    {
	        for(j=n;j>=1;j--)
	        {
	            if(j>i)
	            	System.out.print(j);
	            else 
	            	System.out.print(i);
	        }
	        for(j=2;j<=n;j++)
	        {
	            if(j>i) 
	            	System.out.print(j);
	            else 
	            	System.out.print(i);
	        }
	        System.out.println();
	    }
	}

}
