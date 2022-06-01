package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
class Student
{
	public Student(int i, String string, int j) {
		this.rollno=i;
		this.age=j;
		this.name=string;
		// TODO Auto-generated constructor stub
	}
	int rollno;
	String name;
	int age;
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
	}
public class StrudentDetails1 {

	public static void main(String[] args) {
		ArrayList<Student>a = new ArrayList<>();
		Arrays.sort(new int[] {1,2,3});
		Student s1=new Student(101,"kalai",23);  
		Student s2=new Student(102,"vani",21);  
	    Student s3=new Student(103,"brindha",25);  
		  
a.add(s1);
a.add(s2);
a.add(s3);
a.add(new Student(105,"teny",26));
System.out.println("iterating through for loop=");

for(Student i:a)
{
	
	System.out.println("enter name="+i.getName());
	System.out.println("enter age="+i.getAge());
	System.out.println("enter Rollno="+i.getRollno());
}
System.out.println("iterating through iterator");

Iterator itr=a.iterator();  
while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
}

	}

}
