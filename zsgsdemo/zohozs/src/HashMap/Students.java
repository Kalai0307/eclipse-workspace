package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Students {
	static HashMap<Integer,StudentsPojo> hm= new HashMap<>();
	public static void main(String[] args) {
		Students s= new  Students();
		while(true)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("1. add student");
			System.out.println("2.print array");
			System.out.println("3.remove studentDetail");
			System.out.println("4.adding  new student detail");
			System.out.print("enter your choice: ");
			byte facultyChoice = sc.nextByte();

			if (facultyChoice == 1)
			{
				s.AddingStudent();
				System.out.println();
			}
			else if(facultyChoice==2)
			{
				s.printingDetails();
			}
			else if(facultyChoice==3)
			{
				s.removeDetails();
			}
			
		}
	}
	

	public  void removeDetails() {
		System.out.println("enetr the id to be removed");
		Scanner sc= new Scanner(System.in);
		String id=sc.next();
		int index;
		for(Map.Entry<Integer,StudentsPojo> m: hm.entrySet())
		{
			if(m.getKey().equals(id))
			{
				
			}
		}
	}


	public void printingDetails() {
		
		for(Map.Entry<Integer, StudentsPojo >m:hm.entrySet())
		{
			System.out.println(m.getKey()+"      "+m.getValue());
		}
		
	}


	public    void AddingStudent() {
		Scanner sc= new Scanner(System.in);
		//HashMap<Integer,StudentsPojo> hm= new HashMap<>();
		
		StudentsPojo stu= new StudentsPojo();
		
		System.out.println("enter name");
		
		String name = sc.nextLine();
		System.out.println("enter age");
		int age= sc.nextInt();
		System.out.println("enter rollno");
		int rollno= sc.nextInt();
				
		stu.setName(name);
		stu.setAge(age);
		stu.setRollNo(rollno);
		 hm.put(rollno, stu);
			
	}


}
