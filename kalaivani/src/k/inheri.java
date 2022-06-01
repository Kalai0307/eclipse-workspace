package k;





public class inheri {
	public static void main(String []args)
	{
		B obj=new B();
		obj.i=5;
		obj.j=2;
		
	
		obj.sub();
	//System.out.println(obj.k);
		
		//obj.add();
	//System.out.println(obj.k);
		
		
	}
	
}
class A
{
	int i,j,k;
	public void add()
	{
		
		System.out.println("hi");
		
	}

}

class B extends A
{
	int i,j,k;
	public void sub()
	{
		
	
		System.out.println("hello");
	}

}
/*class c extends B
{
	int i,j,k;
	public void mul()
	{
		k=i*j;
		System.out.println(k);
	}

}*/
  
   
		
		
		
