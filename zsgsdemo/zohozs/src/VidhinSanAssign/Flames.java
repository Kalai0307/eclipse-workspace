package VidhinSanAssign;

import java.util.ArrayList;

public class Flames {

	public static void main(String[] args) {
		String s1="kalai";
		String s2="vani";
		String s="flames";
		int TotalLength=s1.length()+s2.length();
		System.out.println("totallength = "+TotalLength);
		
		ArrayList<Character> a= new ArrayList<>();
		
		for(int i=0;i<s1.length();i++)
		{
			char c= s1.charAt(i);
			a.add(c);
		}
		ArrayList<Character> b= new ArrayList<>();
		for(int i=0;i<s2.length();i++)
		{
			char c= s2.charAt(i);
			b.add(c);
		}
		
		for(int i=0;i<=a.size()-1;i++)
		{
			for(int j=0;j<=b.size()-1;j++)
			{ 
				
				if(a.get(i).equals(b.get(j)))
				{
					TotalLength=TotalLength-2;
					b.remove(j);
				}
			}
		}
		System.out.println(TotalLength);
		ArrayList<Character> c= new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			char k= s.charAt(i);
			c.add(k);
		}
		int index;
		System.out.println("c array size"+c.size());
		while(c.size()!=0)
		{
		index= Math.abs(TotalLength-c.size());
		System.out.println(index);
		c.remove(index);
		System.out.println(c);
		}
		
		

	}

}
