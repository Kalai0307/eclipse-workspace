package com.zoho.bus;

import java.util.ArrayList;

public class Tese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> c= new ArrayList<Integer>();
		c.add(0);
		c.add(1);
		c.add(0);
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		 Integer [] arr=new Integer [c.size()];
		
	       arr=c.toArray(arr);
	      int  noOfJumps=0;
	      int i=0;
	      while(i<arr.length-1)
	      {
	        if(arr[i+2]==1)
	        {
	          i++;
	          noOfJumps++;
	    
	        }
	        else
	        {
	        i=i+2;
	        noOfJumps++;
	      }}
System.out.println(noOfJumps);
	}

}
