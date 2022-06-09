import java.util.Scanner;

public class MarsSignal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s= sc.next();
		char ch = 0 ;
		int count=0;
		int size=s.length();
		for(int i=0;i<s.length();i=i+3)
		{ch=s.charAt(i);
			if(ch=='S'||ch=='O')
			{
				i++;
				
				//ch=s.charAt(i);
				if(ch=='O')
				{
					i++;
				//	ch=s.charAt(i);
					if(ch=='S')
					{
						i++;
					}
				}
			}
			else
			{
				count++;
			}
			
		}
		int result=size-count;
System.out.println(count);
	}

}
