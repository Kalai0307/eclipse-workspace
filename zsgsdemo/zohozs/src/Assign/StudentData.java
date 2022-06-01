package Assign;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentData {
	
	Scanner sc = new Scanner(System.in);
	EnterDetails std = new EnterDetails();

	public void enterStudentDetails(ArrayList<EnterDetails> student) {

		//System.out.println("enter number of students");
		//int NoOfStudents = sc.nextInt();
		
		System.out.print("Enter name: ");
		String userName = sc.nextLine();
		
		System.out.print("Enter age: ");
		int userAge = sc.nextInt();
		
		sc.nextLine();
		
		std.setAge(userAge);
		std.setStudentName(userName);
		
		student.add(std);
	}

	public void printingdetails(ArrayList<EnterDetails> student) {
		for (EnterDetails item : student) {
			System.out.println(item.getAge());
			System.out.println(item.getEmail());
		}
	}

	public void addingToTheFirstIndex() {
		student.add(0, std);
		System.out.println("enter students name=");
		sc.nextLine();
		std.setStudentName(sc.nextLine());
		System.out.println("enter Students age=");
		std.setAge(sc.nextInt());
		System.out.println("Total Marks");
		std.setTotalMark(sc.nextInt());
		System.out.println("enter student email");
		std.setEmail(sc.next());
		// student.add(0,std);

	}

}
