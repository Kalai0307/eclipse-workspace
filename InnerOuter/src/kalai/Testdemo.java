package kalai;
class Outer
{
	int a;
	int b;
	int res;//variable
	public void Show()
	{
	res=a+b;	
		
	}
	static class Inner
	{ int m;
	int p,q;
	int result;
		public void Display()
		{
			result=p+q;
			//System.out.println("addition="+obj1.result);
			}
	}
}
public class Testdemo {
	public static void main(String[]args)
	{
		Outer obj=new Outer();
	    // obj.Show();
	     obj.a=5;
	     obj.b=6;
	     obj.Show();
	     System.out.println("addition="+obj.res);
	     Outer.Inner obj1= new Outer.Inner();
	     obj1.p=10;
	     obj1.q=6;
	     obj1.Display();
	     System.out.println("addition="+obj1.result);
	     
	    // System.out.println("addition=");
	}

}
