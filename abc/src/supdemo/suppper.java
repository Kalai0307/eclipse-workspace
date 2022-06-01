package supdemo;

public class suppper {
public static void main(String[]args)
{
	B obj = new B();
	obj.shy();
}
}
class A
{
	public void shy()
	{
		int i=6;
		//super();
	System.out.println("print A"+i);
	}
/*	public A(int i)
	{
	///	super();
	System.out.println("print A"+i);
	}*/
	

}
class B extends A
{ 
	public void shy ()
	{int j=5;
		super.shy();
	System.out.println("print B"+j);
	}

	/*public B(int i)
	{
		super(i);
	System.out.println("print B"+i);
	}*/

}