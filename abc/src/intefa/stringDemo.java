package intefa;
class form
{
	int num;
	String name;
	int weight;
	public form(int i,String name ,int j)
	{
	 num=i;
	 this.name  =name;
	 weight=j;
	 
	}
	public void filling()
	{
		System.out.println("my number"+num);
		System.out.println("my name is "+name);
		System.out.println("my weight is  "+weight);
	}
	
	
}

public class stringDemo {
	
	public static void main(String args [])
	{
	form obj= new form(10,"kalai",53);
	//obj.num=10;
	obj.filling();
	
	
	}

}
