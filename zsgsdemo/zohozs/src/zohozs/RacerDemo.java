package zohozs;

import java.util.ArrayList;

public class RacerDemo {

	public static void main(String[] args) {
/*		String s="i love india";
		int n =s.length();
		String array[]= s.split(" ");
		ArrayList<String> a= new ArrayList<String>();
		for(String i:array)
		{a.add(i);
			
		}
		int len= a.size();
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(a.get(i)+" ");
		}*/
String s[] = "i like this program very much".
        split(" ");
String ans = "";
for (int i = s.length - 1; i >= 0; i--) 
{
ans += s[i] + " ";
}
System.out.println("Reversed String:");
System.out.println(ans.substring(0,  ans.length() - 1));
		
		
		
		
		
		
	}

}
