import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {
public static void main(String args[])
{
    //public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
         ArrayList<Integer> c = new ArrayList<>();
         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(203,204,205,206,207,208,203,204,205,206));
         ArrayList<Integer> brr= new ArrayList<Integer>(Arrays.asList(203,204,204,205,206,207,205,208,203,206,205,206,204));
         int count=0;
         int count1=0;
       //  int asize=arr1.size();
       //  int bsize=brr1.size();
       //  int arraysize=0;
        int p;
    for(int i=0;i<arr.size();i++)
    {
    	p=arr.get(i);
       for(int j=0;j<arr.size();j++)
       {
           if(p==arr.get(j))
           count++;
           
       }
       System.out.print(count);
       for(int k=0;k<brr.size();k++)
       {
          if(p==brr.get(k)) 
          count1++;
          
       }
       System.out.print(" "+count1);
       System.out.println();
       if((count1+count)%2!=0)
       {
           c.add(arr.get(i));
       }
          count=0;
         count1=0;
    }
    Collections.sort(c);
    System.out.println(c);
    int csize=c.size();
    for(int i=0;i<c.size();i++)
    {for(int j=i;j<c.size();j++)
    	
    {if(c.get(i)==c.get(j))
    {c.remove(i);
    i++;
    	}
    }
    }
    System.out.println(c);
    
  
    }

}


