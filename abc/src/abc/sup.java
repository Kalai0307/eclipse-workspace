package abc;

public class polymorORiding {
	public static void main(String[]args)
	{
		A obj=new A();
		obj.show();
		A a;
		a.show();
	}

}
class A
{
public void show()
{
	System.out.println("it is A");
	
}
}
class B extends A
{
public void show()
{
	System.out.println("it is b");
}
	

}