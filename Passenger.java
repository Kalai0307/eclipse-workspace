
public class Passenger {
	
	private String name;
	private int age;
	private String gender;
	public enum Gender
	{
		female,male,transgender
	};
	
	private long aadhar;
	private long phno;
	private String boardingPoint;
	private String destinationPoint;
	private String seatPreference;
	
	
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
	 * @return the gender
	 */
	public String isGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the aadhar
	 */
	public long getAadhar() {
		return aadhar;
	}
	/**
	 * @param aadhar the aadhar to set
	 */
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	/**
	 * @return the phno
	 */
	public long getPhno() {
		return phno;
	}
	/**
	 * @param phno the phno to set
	 */
	public void setPhno(long phno) {
		this.phno = phno;
	}
	/**
	 * @return the boardingPoint
	 */
	public String getBoardingPoint() {
		return boardingPoint;
	}
	/**
	 * @param boardingPoint the boardingPoint to set
	 */
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	/**
	 * @return the destinationPoint
	 */
	public String getDestinationPoint() {
		return destinationPoint;
	}
	/**
	 * @param destinationPoint the destinationPoint to set
	 */
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	/**
	 * @return the seatPreference
	 */
	public String getSeatPreference() {
		return seatPreference;
	}
	/**
	 * @param seatPreference the seatPreference to set
	 */
	public void setSeatPreference(String seatPreference) {
		this.seatPreference = seatPreference;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", gender=" + gender + ", aadhar=" + aadhar + ", phno="
				+ phno + ", boardingPoint=" + boardingPoint + ", destinationPoint=" + destinationPoint
				+ ", seatPreference=" + seatPreference + "]";
	}
	public boolean genderIsPresent(String gender) {
		 Gender genderList[]=Gender.values();
		for(int i=0;i<genderList.length;i++)
		{
			if(gender.equals(genderList[i].name()))
			{
				return true;
			}
		}
		return false;
		
	}
	
	
	

}
