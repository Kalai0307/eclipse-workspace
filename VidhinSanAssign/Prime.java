package VidhinSanAssign;

public class Prime {

	public static void main(String[] args) {
	int low =20,high=50;
	while(low<high)
	{
		if(checkPrimeNumber(low))
		{
			System.out.println(low);
		}
		low++;
	}

	}

	private static boolean checkPrimeNumber(int low) {
		// for(int i=0TODO Auto-generated method 
		boolean flag= true;
      for(int i=2;i<=low/2;i++)
      { 
    	  if(low%i==0)
    	  {
    		  flag=false;
    		  break;
    	  }
      }
		return flag;
	}

}
