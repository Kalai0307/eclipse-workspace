package VidhinSanAssign;

import java.util.ArrayList;

public class Repeatedsrtring {

	public static void main(String[] args) {
		 ArrayList<Character> a= new ArrayList<>();
		   String s= "abcack";
		   int n=10;
	        int j=s.length();
	      int p=0;
	     for(int i=0;i<n;i++)
	     {
	       a.add(s.charAt(p));
	       p++;
	       if(p==j)
	       {
	         p=0;
	       }
	     }
	      
	     System.out.println(a);
	      int count=0;
	    char  ch = 'a';
	      for(int i=0;i<a.size();i++)
	      {
	        if(a.get(i)==ch)
	        {
	          count++;
	        }
	      }
	      System.out.println("count="+count);
	      
	    
	    
	}

}
