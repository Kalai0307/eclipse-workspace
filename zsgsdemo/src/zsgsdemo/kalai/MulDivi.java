package zsgsdemo.kalai;


class Multiply
{
	int n =10;
	public void table()
	{
		for(int i=1;i<n;i++)
		{
			System.out.println(i+"*"+5+"="+i*5);
		}
	}
}
class Subtraction
{int n=10;
	public void sub()
	{
		for(int i=1;i<n;i++)
		{
			System.out.println(i+"-"+5+"="+i*5);
		}
	}
}
public class MulDivi {

	public static void main(String[] args) {
	Multiply obj =new Multiply ();
	obj.table();
    Subtraction ob =new Subtraction();
    ob.sub();
	}

}
