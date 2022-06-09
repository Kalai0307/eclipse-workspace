package com.zoho.kalaiTravels;

public class BusDetails {

	private int noOfSeatsAvailable;
	private String driverName;
	private Long driverPhNo;
	private int bookedSeat;
	private int NoofBookedSeat;
	
	public void setBookedSeat(int bookedSeat)
	{
		this.bookedSeat=bookedSeat;
	}
	public int getBookedSeat()
	{
		return this.bookedSeat;
	}
	public int setNoOfSeatsAvailable(int count) {
	   return this.noOfSeatsAvailable = count;
	}
	
	public int getNoOfSeatsAvailable() {
		return this.noOfSeatsAvailable;
	}
	/**
	 * @return the driverName
	 */
	public String getDriverName() {
		return driverName;
	}
	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	/**
	 * @return the driverPhNo
	 */
	public Long getDriverPhNo() {
		return driverPhNo;
	}
	/**
	 * @param driverPhNo the driverPhNo to set
	 */
	public void setDriverPhNo(Long driverPhNo) {
		this.driverPhNo = driverPhNo;
	}
	public int getNoofBookedSeat() {
		return NoofBookedSeat;
	}
	public void setNoofBookedSeat(int noofBookedSeat) {
		NoofBookedSeat = noofBookedSeat;
	}
		
	

}
