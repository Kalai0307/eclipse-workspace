package com.zoho.bus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EqualizeTheArary {

	public static void main(String[] args) {
	ArrayList<Integer> arr= new ArrayList<Integer>();
		//ArrayList<Integer> d= new ArrayList<Integer>();
		
		arr.add(96);
		arr.add(96);
		arr.add(45);
		arr.add(52);
		arr.add(73);
		arr.add(44);
		arr.add(51);
		arr.add(96);
//		.add(3);
//		c.add(3);
//		c.add(3);
		int count=0;
	     int removalcount=0;
	     ArrayList<Integer> d= new ArrayList<Integer>();
	     for(int i=0;i<arr.size();i++){
	       for(int j=0;j<arr.size();j++)
	       {
	         if(arr.get(i)==arr.get(j))
	         count++;
	       }
	       d.add(count);
	       count=0;
	     }
	     Collections.sort(d);
	     System.out.println(d);
	     int max=d.get(d.size()-1);
	     System.out.println(max);
	     for(int i:d)
	     {
	       if(d.get(i)<max)
	       removalcount++;
	     //  System.out.println("remove"+removalcount);
	     }
	     System.out.println("remove"+removalcount);
	    // System.out.println(d.size());
	     int result= d.size()-removalcount;
	    System.out.println(result);
	}

}
