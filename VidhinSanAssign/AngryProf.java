package VidhinSanAssign;

import java.util.ArrayList;

public class AngryProf {

	public static void main(String[] args) {
		 int count=0;
		 ArrayList <Integer>a= new ArrayList<>();
		 a.add(-2);
		 a.add(-1);
		 a.add(0);
		 a.add(1);
		 a.add(2);
		 int k=3;
		    for(int i=0;i<a.size();i++)
		    {
		      if(a.get(i)<=0)
		      {
		        count++;
		      }
		    }
		    if( count<=k)
		   System.out.println("YES");
		    else
		    	System.out.println("no");
		    }


	}


