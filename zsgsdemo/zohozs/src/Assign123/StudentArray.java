package Assign123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class StudentArrayPojo {
	private String StudentName;
	private int age;
	private int rollNo;
	private String Email;

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int RollNo) {
		rollNo = RollNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}

public class StudentArray {

	Scanner sc = new Scanner(System.in);

	static void makingStudentDataBase(ArrayList<StudentArrayPojo> student) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter student name: ");
		String Studentname = sc.nextLine();

		System.out.println("enter student age: ");
		int age = sc.nextInt();
		System.out.println("enter student rollno :");
		int rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("enter student email :");
		String email = sc.next();
		StudentArrayPojo studentDetails = new StudentArrayPojo();
		studentDetails.setStudentName(Studentname);
		studentDetails.setAge(age);
		studentDetails.setRollNo(rollNo);
		studentDetails.setEmail(email);
		student.add(studentDetails);

	}
	// ================================================================================================================

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentArrayPojo> student = new ArrayList<>();
		while (true) {
			System.out.println("1. new student");
			System.out.println("2.print array");
			System.out.println("3.remove studentDetail");
			System.out.println("4.adding  new student detail");
			System.out.println("5.sort the students by name ");
			System.out.println("6.retrive student detail by roll no");
			System.out.println("7.reverse the students details");
			System.out.println("8.copy the students details to another list");
			System.out.println("9.shuffle the student details");
			System.out.println("10.extract a portion from student info");
			System.out.println("11.swaping two students details");
			System.out.println("12.join two array list of students details");
			System.out.println("13.trim");
			System.out.println("18.to check the details are empty or not");
			System.out.println("19.to empty thr details");
			System.out.println("20.to exit");

			System.out.println("=======================================================");

			System.out.print("enter your choice: ");
			byte facultyChoice = sc.nextByte();

			if (facultyChoice == 1) {
				makingStudentDataBase(student);
				System.out.println("======================================");
			} else if (facultyChoice == 2) {
				printingStudentArray(student);
				System.out.println("======================================");
			} else if (facultyChoice == 3) {
				System.out.println("enter the student index to be removed");
				int index = sc.nextInt();
				removeStudentDetail(student, index);
				System.out.println("======================================");
			} else if (facultyChoice == 4) {
				addingNewStudent(student);
				System.out.println("======================================");
			} else if (facultyChoice == 5) {
				sortByname(student);
				System.out.println("======================================");
			} else if (facultyChoice == 6) {
				System.out.println("details of the roll no:");
				int Roll = sc.nextInt();
				retriveStudentDetail(student, Roll);
				System.out.println("======================================");

			} else if (facultyChoice == 7) {
				System.out.println("reverse the student details");
				reverse(student);
				System.out.println("======================================");
			} else if (facultyChoice == 8) {
				copydetails(student);
				System.out.println("=====================================");
			} else if (facultyChoice == 9) {
				shuffledetails(student);
				System.out.println("======================================");
			} else if (facultyChoice == 10) {
				System.out.println("enter the start  index");
				int start = sc.nextInt();
				System.out.println("enter the end  index");
				int end = sc.nextInt();

				extractStudentDeatils(student, start, end);
				System.out.println("=====================================");
			} else if (facultyChoice == 11) {
				System.out.println("enter the two index to swap deails");
				int swap1 = sc.nextInt();
				int swap2 = sc.nextInt();
				swap(student, swap1, swap2);
			} else if (facultyChoice == 12) {
				joindetails(student);

				System.out.println();
			}

			else if (facultyChoice == 13) {
				trim(student);

			} else if (facultyChoice == 14) {
				Toincrease(student);// not completed

			} else if (facultyChoice == 15) {
				 Clone(student);
			}

			else if (facultyChoice == 18) {
				EmptyOrNot(student);

			} else if (facultyChoice == 19) {
				emptyTheDetails(student);

			} else if (facultyChoice == 21) {

			}

		}
	}

	private static void Clone(ArrayList<StudentArrayPojo> student) {
		// TODO Auto-generated method stub
		ArrayList<StudentArrayPojo> cloneList = new ArrayList<StudentArrayPojo>();
		cloneList= (ArrayList<StudentArrayPojo>) student.clone();
		for( StudentArrayPojo item: cloneList)
		{
			System.out.println("student name:" + item.getStudentName());
			System.out.println("student age:" + item.getAge());
			System.out.println("student roll no:" + item.getRollNo());
			System.out.println("student email:" + item.getEmail());
		}
		
	}
	public static void Toincrease(ArrayList<StudentArrayPojo> student) {

	}

	public static void trim(ArrayList<StudentArrayPojo> student) {
		student.trimToSize();

	}

	public static void EmptyOrNot(ArrayList<StudentArrayPojo> student) {
		// TODO Auto-generated method stub

		System.out.println(student.isEmpty());

	}

	public static void emptyTheDetails(ArrayList<StudentArrayPojo> student) {
		// TODO Auto-generated method stub
		student.clear();

	}

	public static void joindetails(ArrayList<StudentArrayPojo> student) {
		// TODO Auto-generated method stub
		ArrayList<StudentArrayPojo> student2 = new ArrayList<StudentArrayPojo>();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter student name: ");
		String Studentname = sc.nextLine();

		System.out.println("enter student age: ");
		int age = sc.nextInt();
		System.out.println("enter student rollno :");
		int rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("enter student email :");
		String email = sc.next();
		StudentArrayPojo studentDetails = new StudentArrayPojo();
		studentDetails.setStudentName(Studentname);
		studentDetails.setAge(age);
		studentDetails.setRollNo(rollNo);
		studentDetails.setEmail(email);
		student2.add(studentDetails);
		student.addAll(student2);

	}

	public static void swap(ArrayList<StudentArrayPojo> student, int swap1, int swap2) {
		// TODO Auto-generated method stub
		Collections.swap(student, swap1, swap2);

	}

	public static void extractStudentDeatils(ArrayList<StudentArrayPojo> student, int start, int end) {

		List<StudentArrayPojo> portionOfStudentList = student.subList(start, end);
		// System.out.println(portionOfStudentList);
		for (StudentArrayPojo individualStudentDetails : portionOfStudentList) {
			System.out.println(" ================================================= ");
			System.out.println("student name:" + individualStudentDetails.getStudentName());
			System.out.println("student age:" + individualStudentDetails.getAge());
			System.out.println("student roll no:" + individualStudentDetails.getRollNo());
			System.out.println("student email:" + individualStudentDetails.getEmail());
			System.out.println("===================================================");
		}
	}

	private static void shuffledetails(ArrayList<StudentArrayPojo> student) {

		Collections.shuffle(student);
	}

	private static void copydetails(ArrayList<StudentArrayPojo> student) {
		ArrayList<StudentArrayPojo> copylist = student;

		System.out.println("printing the copied elements");
		for (StudentArrayPojo individualStudentDetails : copylist) {
			System.out.println(" ================================================= ");
			System.out.println("student name:" + individualStudentDetails.getStudentName());
			System.out.println("student age:" + individualStudentDetails.getAge());
			System.out.println("student roll no:" + individualStudentDetails.getRollNo());
			System.out.println("student email:" + individualStudentDetails.getEmail());
			System.out.println("===================================================");
		}

	}

	// System.out.println("=============================");
	public static void reverse(ArrayList<StudentArrayPojo> student) {
		// TODO Auto-generated method stub
		Collections.reverse(student);
	}

//=================================================================================================
	public static void sortByname(ArrayList<StudentArrayPojo> student) {
		ArrayList<String> sortedNames = new ArrayList<>();
		for (StudentArrayPojo name : student) {
			sortedNames.add(name.getStudentName());

		}

		Collections.sort(sortedNames);
		System.out.println(sortedNames);

		int indexPointer = 0;

		while (indexPointer != student.size()) {
			for (int i = indexPointer; i < student.size(); i++) {
				if (student.get(i).getStudentName() == sortedNames.get(indexPointer)) {
					StudentArrayPojo temp = student.get(i);
					student.set(i, student.get(indexPointer));
					student.set(indexPointer, temp);
				}
			}

			indexPointer++;
		}

	}

//=====================================================================================================================
	public static void retriveStudentDetail(ArrayList<StudentArrayPojo> student, int roll) {
		for (StudentArrayPojo individualRollNo : student) {
			if (roll == individualRollNo.getRollNo()) {
				System.out.println("student roll no" + individualRollNo.getRollNo());
				System.out.println("student name" + individualRollNo.getStudentName());
				System.out.println("student age" + individualRollNo.getAge());
				System.out.println("student email" + individualRollNo.getEmail());

			}
		}

	}

//=============================================================================================================================
	public static void addingNewStudent(ArrayList<StudentArrayPojo> student) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter student name: ");
		String Studentname = sc.nextLine();

		System.out.println("enter student age: ");
		int age = sc.nextInt();

		System.out.println("enter student rollNo :");
		int rollNo = sc.nextInt();
		sc.nextLine();

		System.out.println("enter student email :");
		String email = sc.next();

		StudentArrayPojo studentDetails = new StudentArrayPojo();

		studentDetails.setStudentName(Studentname);
		studentDetails.setAge(age);
		studentDetails.setRollNo(rollNo);
		studentDetails.setEmail(email);

		student.add(0, studentDetails);

	}

//=========================================================================================================================
	public static void removeStudentDetail(ArrayList<StudentArrayPojo> student, int index) {

		student.remove(index);

	}
//==========================================================================================================================

	public static void printingStudentArray(ArrayList<StudentArrayPojo> student) {
		for (StudentArrayPojo individualStudentDetails : student) {
			System.out.println(" ================================================= ");
			System.out.println("student name:" + individualStudentDetails.getStudentName());
			System.out.println("student age:" + individualStudentDetails.getAge());
			System.out.println("student roll no:" + individualStudentDetails.getRollNo());
			System.out.println("student email:" + individualStudentDetails.getEmail());
			System.out.println("===================================================");

		}
	}
}
