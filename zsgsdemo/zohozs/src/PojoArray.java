import java.util.ArrayList;


class employee
{
	private String name;
	private int rollno;
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno()
	{
		this.rollno=rollno;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge()
	{
		this.age=age;
	}
	
	public employee(String name,int rollno,int age)
	{
		this.age=age;
		this.name=name;
		this.rollno=rollno;
	}
	}
public class PojoArray {

	public static void main(String[] args) {
		ArrayList <employee> e=new ArrayList<>();
	//	employee e1=new employee("kalai",1,25);
	//	employee e2=new employee("kalaivani",2,25);
		//e.add(e1);
	//	e.add(e2);
		e.add(new employee("kalai",1,15));
		e.add(new employee("kalaivani",2,25));
		e.add(new employee("ananthi",3,22));
		
		for(employee i:e)
		{
			
			System.out.println("enter name="+i.getName());
			System.out.println("enter age="+i.getAge());
			System.out.println("enter Rollno="+i.getRollno());
		}
		
		

	}

}
