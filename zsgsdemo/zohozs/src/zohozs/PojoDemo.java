package zohozs;

import java.util.Scanner;

//import zsgsdemo.StudentDetails;

class StudentDetails
{
	private String name;
	private int age;
	private String Gender;
	private int  regno;
	private long phno;
	
private	String email;

public long getPhno() {
	return phno;
}

public void setPhno(long phno) {
	this.phno = phno;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGender() {
	return Gender;
}

public void setGender(String gender) {
	Gender = gender;
}

public int getRegno() {
	return regno;
}

public void setRegno(int regno) {
	this.regno = regno;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
	
	
	
	
}

public class PojoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		StudentDetails obj =new StudentDetails();
		for(int i=0;i<n;i++)
		{
			
	       
	        System.out.print("Enter Name: ");
	        obj.setName(sc.next());
	        System.out.print("Enter age: ");
	        obj.setAge(sc.nextInt());
	        System.out.print("Enter Roll Number: ");
	        obj.setRegno(sc.nextInt());	
	        System.out.print("Enter phone Number: ");
	        obj.setPhno(sc.nextLong());
	        System.out.print("Enter gender: ");
	        obj.setGender(sc.next());
	        System.out.print("Enter e mail: ");
	        obj.setEmail(sc.next());
	         

	}

}
}
