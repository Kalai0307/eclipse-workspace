package assignment;

import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	int rollno;
	int marks;
	
/*public Student(int rn,int marks)	
{
	this.rollno= rn;
	this.marks=marks;
	}*/
 Student(int rn, int marks2) {
	// TODO Auto-generated constructor stub
}
public void checking1()  
{
	System.out.println("enter roll no");
	System.out.println(rollno);
	System.out.println("enter marks");
	String s1="pass",s2="fail";
	String result = marks>35?s1:s2;
	System.out.println(result);
	
	
	}
public void checking() {
	// TODO Auto-generated method stub
	
}

}

public class StupassorFail {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("enter the students details and marks");
	
ArrayList<Student> a=new ArrayList<>();


 
	 int rn=sc.nextInt();
	 
	 int marks= sc.nextInt();
	 Student s= new Student(rn, marks);
	 
	 s.checking1();
	
	}

}
