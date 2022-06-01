package HashMap;

public class StudentsPojo {
	private String name;
	private int age;
	private int rollNo;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "StudentsPojo [name=" + name + ", age=" + age + ", rollNo=" + rollNo + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getRollNo()=" + getRollNo() 
				;
	}
	

}
