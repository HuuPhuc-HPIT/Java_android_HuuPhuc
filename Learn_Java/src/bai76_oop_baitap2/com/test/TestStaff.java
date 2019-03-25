package bai76_oop_baitap2.com.test;

import bai76_oop_baitap2.com.model.Employee;
import bai76_oop_baitap2.com.model.Executive;
import bai76_oop_baitap2.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		Staff st= new Staff();
		Employee teo= new Employee();
		teo.setName("Le van teo");
		teo.setAddress("hue");
		teo.setPhone("23");
		teo.setPayRate(0.12);
		teo.setSocialSecurityNumber("alo 123");		
		st.addStaffMember(teo);
		
		Employee ty= new Employee();
		ty.setName("Le van ty");
		ty.setAddress("ha noi");
		ty.setPhone("32");
		ty.setPayRate(0.14);
		ty.setSocialSecurityNumber("alo 456");		
		st.addStaffMember(ty);
		
		Executive an= new Executive();
		an.setName("Le van an");
		an.setAddress("sai gon");
		an.setPhone("3562");
		an.setPayRate(0.16);
		an.setSocialSecurityNumber("alo 789");
		an.awardBonus(100);
		st.addStaffMember(an);
		
		st.payDay();
	}

}
