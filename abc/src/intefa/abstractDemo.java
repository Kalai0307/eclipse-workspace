package intefa;
abstract class kalai
{
	public void dance()
	{
		System.out.println("i can dance well");
	}

	public abstract void  move();
	public abstract void  run();
}
abstract class vani extends kalai
{
public void move ()
{
System.out.println("i can move");
	}
	
}
class papa extends vani
{
	
public void run()
{
	System.out.println("i can run");
	

}
}

public class abstractDemo {
	public static void main(String args[])
	{
		kalai obj= new papa();
		obj.dance();
		obj.move();
		//8`	obj.run();
		
		
		
	
	}

}
