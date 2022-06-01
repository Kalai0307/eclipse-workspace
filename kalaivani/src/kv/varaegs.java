package kv;



class display
{
	
	public void show(int...n)
	{

	for( int i:n)
	{
	System.out.println(i);
	}
	}
	
}

publi c class varaegs {
	
	
	public static void main(String []args)
	{
		display obj= new display();
		obj.show(5 );
	}
}
