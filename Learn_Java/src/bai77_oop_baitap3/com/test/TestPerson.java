package bai77_oop_baitap3.com.test;

import java.util.ArrayList;

import bai77_oop_baitap3.com.model.Man;
import bai77_oop_baitap3.com.model.Person;
import bai77_oop_baitap3.com.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person>dsPerson=new ArrayList<Person>();
		Person an= new Man();
		an.setFirstName("An");
		
		Person hong= new Woman();
		hong.setFirstName("HOng");
		((Woman)hong).setWearingMakup(true);
		
		dsPerson.add(an);
		dsPerson.add(hong);
		for(Person p: dsPerson) {
			if(p instanceof Man) {
				System.out.println(p.getFirstName()+ " la nam");
			}else if(p instanceof Woman) {
				System.out.println(p.getFirstName()+" la nu");
			}
		}
		
	}

}
