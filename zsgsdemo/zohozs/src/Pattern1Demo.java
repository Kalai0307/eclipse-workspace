
public class Pattern1Demo {
	 static String PatternPrinting(int i) 
	 {
		if(i==1)
			return "1";
		if(i==2)
			return "11";
		
		String str="11";
		for(int j=3;j<=i;j++)
		{int count=1;
		String temp="";
			str=str+"$";
			int length=str.length();
			char[] ch=str.toCharArray();
			for(int k=1;k<length;k++)
			{
				if(ch[k]!=ch[k-1])
						
	      	{
	     		temp=temp+count;	
	     		temp=temp+ch[k-1];
	     		count=1;
	    	}
				else
					count++;
				
			}
			str=temp;
		}
		
		return str;
	}	
	public static void main(String[] args) {
		//int n=5;
		for(int i=1;i<=5;i++)
		{
			//PatternPrinting(i);
			System.out.println(PatternPrinting(i));
		}

	}

	
	}
	

/*
public class Pattern2 {
static String countnndSay(int n)
{

if (n == 1)     return "1";
if (n == 2)     return "11";




String str = "11"; 
for (int i = 3; i <= n; i++)
{
    str += '$';
    int len = str.length();

    int cnt = 1; 
    String tmp = ""; 
    char []arr = str.toCharArray();
    
    // Process previous term
    // to find the next term
    for (int j = 1; j < len; j++)
    {
        // If current character
        // doesn't match
        if (arr[j] != arr[j - 1])
        {
            // Append count of 
            // str[j-1] to temp
            tmp += cnt + 0;

            // Append str[j-1]
            tmp += arr[j - 1];

            // Reset count
            cnt = 1;
        }

        // If matches, then increment 
        // count of matching characters
        else cnt++;
    }

    // Update str
    str = tmp;



}
return str;}
public static void main(String[] args) {
	// TODO Auto-generated method stub

    
    for(int i=1;i<5;i++)
    {
    System.out.println(countnndSay(i));
    }
    
}

}
*/