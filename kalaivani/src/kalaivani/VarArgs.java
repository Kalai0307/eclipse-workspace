package kalaivani;


class display
{
	//int sum;
	//int i=0;
	//int n;
	public int show(int...n)
	{
	
	for( int i:n)
	{
	System.out.println(i);
	}
	
}

public class VarArgs {
public static void main(String []args)
{
	display obj= new display();
	obj.show(5,7,8,9,7,5,48,4);
	
	
 
}
}
