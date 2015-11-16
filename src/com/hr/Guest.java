package com.hr;

public class Guest {
	private String fName;
	private String lName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private int[] numberOfAdults = {0,1,2,3,4,5};
	private int[] numberOfChildren = {0,1,2,3,4};
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int[] getNumberOfChildren() {
		return numberOfChildren;
	}
	public void setNumberOfChildren(int[] numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	public int[] getNumberOfAdults() {
		return numberOfAdults;
	}
	public void setNumberOfAdults(int[] numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}
	
	
}
