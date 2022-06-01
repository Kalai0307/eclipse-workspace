package Assign;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {
	

	public static void main(String[] args) {
		ArrayList<EnterDetails> student = new ArrayList<EnterDetails>();
		
		
		System.out.println("welcome to the students login page");
		
		Scanner sc= new Scanner(System.in);
		// until it is false execute the operation
	    boolean IsExit=true;
	    // creating object student 1 for student data methods where we stored all the methods
	    StudentData student1=new StudentData();	
	    
	    while(IsExit)
	    {
	    	System.out.println("To enter students details press 1");
		
		    System.out.println("to print students details press 2");
	    	
	    	System.out.println("enter the choice");
	    
	        int choice=sc.nextInt();
		    switch(choice)
		    {
	        	case 1:
	        		// to enter students name ,age ,mark, email
	        		student1.enterStudentDetails(student);
	        		break;
	        	case 2:
	        	    // to print the students details
	        	    student1.printingdetails(student);
		            break;
	        	case 3:
	        		//adding student detail  to the first index
	        		student1.addingToTheFirstIndex();
	        		break;
		
		
		
		
		
		
		
		
	    	}
		}
		
		

	}

	
		
}


