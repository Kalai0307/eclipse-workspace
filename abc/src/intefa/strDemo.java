package intefa;


class student 
{
public student(String string, int i) {
	name = string;
	roll=i;
	}
String name;
int roll;
public String toString()
{
return ("student "+name+"rollno "+roll);
}
}
public class strDemo {
	public static void main(String []args)
	{
		student obj =new student ("kalai",5);
		System.out.println(obj);
}
}

