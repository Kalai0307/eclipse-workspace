package zsgsdemo;
class Pattern
{
	public void print(String n, int len)
	{
		for(int i =0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i==j||(i+j)==(len-1))
				{
					System.out.print(n.charAt(j));
				}
				else
					System.out.print(" ");
			}
			System.out.println("\n");
		}
	}
}
public class Xpattern_7 {

	public static void main(String[] args) {
		
		String n="12345";
		int len = n.length();
		Pattern obj=new Pattern();
	obj.print(n,len);
		

	}

}
