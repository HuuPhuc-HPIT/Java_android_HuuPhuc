package bai76_oop_baitap2.com.model;

public class hourly extends Employee {
	private int hoursWorked;
	public void addHours(int hoursWorked) {
		this.hoursWorked=hoursWorked;
	}
	
	public double pay() {
		return this.hoursWorked*50;
	}
	public String toString() {
		return super.toString();
	}
}
