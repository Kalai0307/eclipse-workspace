package zsgsdemo;
class Split
{int n;
	public Split(int i) {
		// TODO Auto-generated constructor stub
		n=i;
	}
public void roll()
{
	for(int i=n;i<120;i=i+4)
	{
		System.out.println(i);
	}
}
	
	
}

public class StudentRoll {

	public static void main(String[] args) {
		System.out.println("group1");
Split obj=new Split(101);
obj.roll();
System.out.println("group2");
Split obj1=new Split(102);
obj1.roll();
System.out.println("group3");
Split obj2=new Split(103);
obj2.roll();
System.out.println("group4");
Split obj3=new Split(104);
obj3.roll();

	}

}
