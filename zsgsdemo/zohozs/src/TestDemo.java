import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
		    private long id;
		    private String name;
		    private byte age;
		    private String gender;
		    private String mobileNumber;

		    Student() {
		        // No - args Constructor ...
		    }

		    public long getId() {
		        return id;
		    }

		    public void setId(long id) {
		        this.id = id;
		    }

		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public byte getAge() {
		        return age;
		    }

		    public void setAge(byte age) {
		        this.age = age;
		    }

		    public String getGender() {
		        return gender;
		    }

		    public void setGender(String gender) {
		        this.gender = gender;
		    }

		    public String getMobileNumber() {
		        return mobileNumber;
		    }

		    public void setMobileNumber(String mobileNumber) {
		        this.mobileNumber = mobileNumber;
		    }
		}
public class TestDemo  {
		    static Student makingStudentDataBase(long studentId) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the student name: ");
		        String studentName = sc.nextLine();

		        System.out.print("Enter the student age: ");
		        byte studentAge = sc.nextByte();

		        sc.nextLine();

		        System.out.print("Enter the student gender: ");
		        String studentGender = sc.nextLine();

		        System.out.print("Enter the student phone number: ");
		        String studentPhoneNumber = sc.nextLine();

		        Student student = new Student();
		        student.setId(studentId);
		        student.setName(studentName);
		        student.setAge(studentAge);
		        student.setGender(studentGender);
		        student.setMobileNumber(studentPhoneNumber);

		        return student;
		    }

		    static void individualStudentDetail(List<Student> studentDetails) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the current student id: ");
		        long currentStudentId = sc.nextLong();

		        for (Student studentDetail : studentDetails) {
		            if (studentDetail.getId() == currentStudentId) {
		                System.out.println("--------------------------------------");
		                System.out.println("Student Id: " + studentDetail.getId());
		                System.out.println("Student Name: " + studentDetail.getName());
		                System.out.println("Student Age: " + studentDetail.getAge());
		                System.out.println("Student Gender: " + studentDetail.getGender());
		                System.out.println("Student Mobile Number: " + studentDetail.getMobileNumber());
		                System.out.println("--------------------------------------");
		            }
		        }
		    }

		    static void printAllStudentDetails(List<Student> studentDetails) {
		        for (Student studentDetail : studentDetails) {
		            System.out.println("--------------------------------------");
		            System.out.println("Student Id: " + studentDetail.getId());
		            System.out.println("Student Name: " + studentDetail.getName());
		            System.out.println("Student Age: " + studentDetail.getAge());
		            System.out.println("Student Gender: " + studentDetail.getGender());
		            System.out.println("Student Mobile Number: " + studentDetail.getMobileNumber());
		            System.out.println("--------------------------------------");
		        }
		    }

		    static List<Student> updateStudentDetail(List<Student> studentDetails, long studentId) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the position to insert this particular student detail: ");
		        int positionOfCurrentStudent = sc.nextInt() - 1;

		        sc.nextLine();

		        System.out.print("Enter the student name: ");
		        String studentName = sc.nextLine();

		        System.out.print("Enter the student age: ");
		        byte studentAge = sc.nextByte();

		        sc.nextLine();

		        System.out.print("Enter the student gender: ");
		        String studentGender = sc.nextLine();

		        System.out.print("Enter the student phone number: ");
		        String studentPhoneNumber = sc.nextLine();

		        Student student = new Student();
		        student.setId(studentId);
		        student.setName(studentName);
		        student.setAge(studentAge);
		        student.setGender(studentGender);
		        student.setMobileNumber(studentPhoneNumber);

		        studentDetails.add(positionOfCurrentStudent, student);
		        return studentDetails;
		    }

		    static void modifyStudentDetails(List<Student> studentDetails) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the student id to whom you want to modify? : ");
		        long currentStudentId = sc.nextLong();

		        sc.nextLine();

		        for (Student studentDetail : studentDetails) {
		            if (studentDetail.getId() == currentStudentId) {
		                System.out.print("Please tell what data you want to change? (Name / Age / Gender / Mob.Num): ");
		                String facultyChoice = sc.nextLine().toLowerCase();

		                switch (facultyChoice) {
		                    case "name" -> {
		                        System.out.print("Enter the current student name: ");
		                        String currentStudentName = sc.nextLine();
		                        studentDetail.setName(currentStudentName);
		                    }
		                    case "age" -> {
		                        System.out.print("Enter the current student age: ");
		                        byte currentStudentAge = sc.nextByte();
		                        studentDetail.setAge(currentStudentAge);
		                    }
		                    case "gender" -> {
		                        System.out.print("Enter the current student gender: ");
		                        String currentStudentGender = sc.nextLine();
		                        studentDetail.setGender(currentStudentGender);
		                    }
		                    case "mobile number" -> {
		                        System.out.print("Enter the current student mobile number: ");
		                        String currentStudentMobileNumber = sc.nextLine();
		                        studentDetail.setMobileNumber(currentStudentMobileNumber);
		                    }
		                    default -> {
		                        System.out.println("Invalid Choice.");
		                        modifyStudentDetails(studentDetails);
		                    }
		                }
		            }
		        }
		    }

		    static void removeIndividualStudent(List<Student> studentDetails) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the student position: ");
		        int currentStudentPosition = sc.nextInt() - 1;

		        for (int i = 0; i < studentDetails.size(); i++) {
		            if (i == currentStudentPosition) {
		                studentDetails.remove(i);
		            }
		        }
		    }

		    static void printSchoolMembers(ArrayList<Student> schoolDetails) {
		        for (Student schoolMember : schoolDetails) {
		            System.out.println("------------------------");
		            System.out.println("School Member Id:" + schoolMember.getId());
		            System.out.println("School Member Name: " + schoolMember.getName());
		            System.out.println("School Member Age: " + schoolMember.getAge());
		            System.out.println("School Member Gender: " + schoolMember.getGender());
		            System.out.println("School Member Mobile Number: " + schoolMember.getMobileNumber());
		            System.out.println("------------------------");
		        }
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        ArrayList<Student> studentDetails = new ArrayList<>();
		        ArrayList<Student> schoolDetails = (ArrayList<Student>) studentDetails.clone();

		        long studentId = 1000L;

		        while (true) {
		            System.out.println("1. New User");
		            System.out.println("2. Old User");
		            System.out.println("3. All User");
		            System.out.println("4. Update User");
		            System.out.println("5. Modify User");
		            System.out.println("6. Remove User");
		            System.out.println("7. School Members");
		            System.out.println("8. Exit");

		            System.out.print("Enter your choice: ");
		            byte facultyChoice = sc.nextByte();

		            if (facultyChoice == 1) {
		                Student student = makingStudentDataBase(studentId++);
		                studentDetails.add(student);
		                schoolDetails.addAll(studentDetails);
		                System.out.println(studentDetails);
		            } else if (facultyChoice == 2) {
		                individualStudentDetail(studentDetails);
		            } else if (facultyChoice == 3) {
		                printAllStudentDetails(studentDetails);
		            } else if (facultyChoice == 4) {
		                schoolDetails.addAll(updateStudentDetail(studentDetails, studentId++));
		                System.out.println(studentDetails);
		            } else if (facultyChoice == 5) {
		                modifyStudentDetails(studentDetails);
		            } else if (facultyChoice == 6) {
		                removeIndividualStudent(studentDetails);
		            } else if (facultyChoice == 7) {
		                printSchoolMembers(schoolDetails);
		            } else if (facultyChoice == 8) {
		                break;
		            } else {
		                System.out.println("Invalid Choice. Please, select from the given option...");
		            }
		        }
		    }
		
		}
		
	
