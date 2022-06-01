package zsgsdemo;

import java.util.ArrayList;
class AddingData
{
	ArrayList<Student> studentData() {
		return null;
	}
	Student s1=new Student("mini",01,25,"female");
	Student s2=new Student("kalai",02,26,"female");	
	ArrayList<Student>sdlist=new ArrayList<>();
	sdlist.add(s1);
	sdlist.add(s2);
	
	System.out.println("student age: " +st.age); 
	
	
}
class Student
{
	public Student(String string, int i, int j, String string2) {
		
	}
	private String name;
	private int rollno;
	private int age;
	private String gender;
}
public class PojoArrayListDemo {

	public static void main(String[] args) {
		
		AddingData ad=new AddingData();
		
		AddingData data;
		ArrayList<Student> listst = data.studentData(); 

		// Now iterate and display all the Student data. 
		   for(Student st:listst)
		   { 
		     System.out.println("Student's name: " +st.name); 
		     System.out.println("Student rollno" +st.rollno); 
		     System.out.println("student age: " +st.age); 
		     System.out.println("student gender: " +st.gender); 
		   } 
		
		
		
		
		 
		
		
		

	}

}
