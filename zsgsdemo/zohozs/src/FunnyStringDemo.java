import java.util.ArrayList;

public class FunnyStringDemo {

	public static void main(String[] args) {
		String s="tmruzxzuwoskqysxztuvosuyrswrnmtxvzsrqwytzrxpltrwusxupw";
	 String	revString="";
	   char ch;
     for (int i=0; i<s.length(); i++)
     {
       ch= s.charAt(i); 
       revString= ch+revString;
     }
     System.out.println(revString);

	
	ArrayList<Integer> a= new ArrayList<>();
	ArrayList<Integer> b= new ArrayList<>();
	for(int i=0;i<s.length();i++)
	{
		a.add((int)s.charAt(i));
	}
	System.out.println(a);
	int n = a.size();
	
	for(int i=1;i<n;i++)
	{
		b.add(a.get(i)-a.get(i-1));
	}
	System.out.println(b);
	int m =b.size();
	int temp=0;
	System.out.println("M:"+m);
	for(int i=0;i<m/2;i++)
	{
		System.out.println("hhh"+b.get(i)+" "+b.get(m-1-i));
		//System.out.println();
		if(b.get(i)!=b.get(m-1-i))
		{
			
		temp=1;
		break;
		
		}
	
	}
	System.out.println(temp);
	if(temp==0)
	{
		System.out.println("funny");
	}
	else
		System.out.println("not funny");
		
		
	
	

}
}