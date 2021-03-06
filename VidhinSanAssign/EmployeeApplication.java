package VidhinSanAssign;

import java.util.ArrayList;
import java.util.Scanner;

import Assign.EnterDetails;

public class EmployeeApplication implements Employee {
	static ArrayList<EmployeeDetailsPojo> employee = new ArrayList<EmployeeDetailsPojo>();

	public static void main(String[] args) {
		System.out.println("ZOHO Employee Details");

		EmployeeApplication empApp = new EmployeeApplication();
		System.out.println("welcome to the employee login page");

		// until it is false execute the operation
		boolean IsExit = true;
		// creating object student 1 for student data methods where we stored all the
		// methods
		EmployeeDetailsPojo emp = new EmployeeDetailsPojo();

		while (IsExit) {
			Scanner sc = new Scanner(System.in);
			System.out.println("To add employee details press 1");
			System.out.println("to print employee details press 2");
			System.out.println("to deleteemployee details through id press 3");

			System.out.println("to retrive employee details press 4");
			System.out.println("to exit press 5");
			
			System.out.println("enter the choice");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				empApp.AddEmployeeDetails();
				System.out.println(employee.size());
				break;
			case 2:
				empApp.PrintEmployeeDetails();
				break;
			case 3:

				empApp.RemoveEmployeeDetails();
				break;
			case 4:

				empApp.RetriveEmployeeDetails();
				
			case 5:
				System.exit(choice);

			}

		}

	}

	public void RetriveEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id to be displayed");
		String empid = sc.next();
		for (EmployeeDetailsPojo i : employee) {
			if (i.getEmployeeId().equals(empid)) {

//				System.out.println("employee name :" + i.getEmployeeName());
//				System.out.println("employee age :" + i.getEmployeeAge());
//				System.out.println("employee id :" + i.getEmployeeId());
//
//				System.out.println("employee mail id :" + i.getEmployeeMailId());
//				
				System.out.println(i.toString());
				break;
			}

		}

	}

	public void PrintEmployeeDetails() {
		// TODO Auto-generated method stub
		for (EmployeeDetailsPojo i : employee) {
			System.out.println("employee name :" + i.getEmployeeName());
			System.out.println("employee age :" + i.getEmployeeAge());
			System.out.println("employee id :" + i.getEmployeeId());
			System.out.println("employee mail id :" + i.getEmployeeMailId());
		}

	}

	public void AddEmployeeDetails() {
		// ArrayList<EmployeeDetailsPojo> employee = new
		// ArrayList<EmployeeDetailsPojo>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee name");
		String employeename = sc.next();
		System.out.println("enter employee Age");
		int employeeAge = sc.nextInt();
		System.out.println("enter employee id");
		String employeeid = sc.next();
		System.out.println("enter employee mailid");
		String employeeMailID = sc.next();

		EmployeeDetailsPojo emp = new EmployeeDetailsPojo();

		emp.setEmployeeName(employeename);
		emp.setEmployeeAge(employeeAge);
		emp.setEmployeeId(employeeid);
		emp.setEmployeeMailId(employeeMailID);

		employee.add(emp);

	}

	public void RemoveEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id to be removed");
		String id = sc.next();
		int index;
		for (EmployeeDetailsPojo i : employee) {
			if (i.getEmployeeId().equals(id)) {
				index = employee.indexOf(i);
				employee.remove(index);
				break;
			}

		}

	}

}
