package VidhinSanAssign;

import java.util.ArrayList;

public class UtopianTree {

	public static void main(String[] args) {
		//Each spring, it doubles in height. 
		//Each summer, its height increases by 1 meter.
	    int initialHeight=1;
	    int n=5;
	    for(int i=1;i<=n;i++)
	    {
	      if(i%2!=0){
	      initialHeight=initialHeight*2;
	   
	      }
	      else{
	        initialHeight=initialHeight+1;
	     
	      }
	    }
	    System.out.println(initialHeight);
	}

}
