
public class StudentInfo {

        private int rollNumber;
        private String name;
        private int totalMarks;
        private int age;


     public String toString(){

         return "Roll Number : "+ getRollNumber()+" , "+"Name : "+getName()+" , "+"Total marks : "+getTotalMarks()+" , "+"Age : "+getAge();
     }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTotalMarks() {
            return totalMarks;
        }

        public void setTotalMarks(int totalMarks) {
            this.totalMarks = totalMarks;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        public int getRollNumber() {
            return rollNumber;
        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

}
