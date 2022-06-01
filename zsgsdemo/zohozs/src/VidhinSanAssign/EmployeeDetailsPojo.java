package VidhinSanAssign;

public class EmployeeDetailsPojo {

	private String employeeName;
	private String employeeId;
	private  int employeeAge;
	private  String employeeMailId;
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeAge
	 */
	public int getEmployeeAge() {
		return employeeAge;
	}
	/**
	 * @param employeeAge the employeeAge to set
	 */
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	/**
	 * @return the employeeMailId
	 */
	public String getEmployeeMailId() {
		return employeeMailId;
	}
	/**
	 * @param employeeMailId the employeeMailId to set
	 */
	public void setEmployeeMailId(String employeeMailId) {
		this.employeeMailId = employeeMailId;
	}
	
	@Override
	public String toString() {
		return " employeeName=" + employeeName + "\n"+", employeeId=" + employeeId +"\n"+ ", employeeAge="
				+ employeeAge +"\n"+ ", employeeMailId=" + employeeMailId ;
				
	}
	
	
}
