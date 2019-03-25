package bai76_oop_baitap2.com.model;

public class Employee extends StaffMember {
	
	protected String socialSecurityNumber;
	protected double payRate;
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public String toString() {
		return super.toString() +"-"+ socialSecurityNumber+"-"+ payRate;
	}
	public double pay() {
		
		return 500;
	}

}