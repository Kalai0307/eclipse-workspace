package VidhinSanAssign;

public class AlphaDemo {

	public static void main(String[] args) {
System.out.println("enter a string");
String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String s= "XYZ";
   int result=0;
	String s1="";	   
   int count=1;
  for(int i=0;i<s.length();i++)
  {
	  int charcatervalue= (int)(s.charAt(i));
	  System.out.println("k"+charcatervalue);
	  result=charcatervalue+count-(int)'A';
	  System.out.println("result"+result);
	  if(result>=alpha.length())
	  {
		  result=result-26;
		  
	  }
	  s1=s1+alpha.charAt(result);
	  
	  result=0;
	  
  }
  System.out.println(s1);
	}

}
