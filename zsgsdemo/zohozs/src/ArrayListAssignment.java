import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListAssignment {

	          public static void main(String[] args) {
		                Scanner sc = new Scanner(System.in);
		                ArrayList<StudentInfo> Student = new ArrayList<>();

		                System.out.println("Enter Student Personal Information :");
		                System.out.println();
		                String str,st;
		                do {
		                    StudentInfo s = new StudentInfo();
		                    System.out.println("Enter roll number");
		                    s.setRollNumber(sc.nextInt());
		                    System.out.println("Enter name of student");
		                    s.setName(sc.next());
		                    System.out.println();
		                    System.out.println("Enter total marks scored");
		                    s.setTotalMarks(sc.nextInt());
		                    System.out.println("Enter the age of Student");
		                    s.setAge(sc.nextInt());
		                    System.out.println("If you want to add another student details enter yes otherwise enter no  ");
		                    str = sc.next();
		                    Student.add(s);
		                } while ((str.equals("yes")));
		                System.out.println("--------------------------------------------------------------------------------------------------------------------");

		                do{
		                System.out.println("Enter case number that you want to perform operations" + "\n" + "Case Number must be in range of 1-20  : ");
		                int method = sc.nextInt();
		                System.out.println(method);


		                  switch (method) {
		                      case 1:
		                          System.out.println("ITERATE STUDENT DETAILS :");
		                          for (StudentInfo s : Student) {
		                              System.out.println(s.toString());
		                              System.out.println();
		                           
		                          }
		                          break;
		                      case 2:
		                          System.out.println("INSERT A ELEMENT AT FIRST POSITION :");              
		                          StudentInfo first = new StudentInfo();
		                          System.out.println("Enter roll number, name, total marks and age one by one :");
		                          first.setRollNumber(sc.nextInt());
		                          first.setName(sc.next());
		                          first.setTotalMarks(sc.nextInt());
		                          first.setAge(sc.nextInt());
		                          Student.add(0,first);
		                          
		                          break;
		                      case 3:
		                    	  //retrive an element
		                    	  System.out.println("index=");
		                    	  int index= sc.nextInt();
		                    	  System.out.println(Student.get(index));
		                    	  break;
		                      case 5:
		                    	  //Remove the element
		                    	  System.out.println("element to be removed");
		                    	  int removeindex=sc.nextInt();
		                    	  System.out.println(Student.remove(removeindex));
		                    	  break;
		                    	  
		                      case 6:
		                    	  int Rollno=sc.nextInt();
		                    	  for(StudentInfo i:Student)
		                    	  {
		                    		 
									if(Rollno==i.getRollNumber())
		                    		  {
		                    			  System.out.println(i.toString());
		                    		  }
		                    	  }
		                      case 7:
		                      Collections.sort(Student,new NameComparator() );
		                    /*.util.Iterator<StudentInfo> itr=Student.iterator();  
		                      while(itr.hasNext()){  
		                      StudentInfo st1=(StudentInfo)itr.next();
		                     */
		                      
		                      
		                    	  
		                  }
		                  System.out.println("if u want to continue enter yes otherwise enter no :");
		                   st=sc.next();

		                  }while ((st.equals("yes")));
		              }

		            }
		    

	
