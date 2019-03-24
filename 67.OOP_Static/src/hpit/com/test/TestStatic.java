package hpit.com.test;

import hpit.com.model.Static;

public class TestStatic {

	public static void main(String[] args) {
		Static a= new Static();
		a.setA(113);
		
		Static b= new Static();
		System.out.println(b.getA());
		
		Static c= new Static();
		System.out.println(c.getA());
		
		c.setA(115);
		System.out.println(a.getA());
			
	}

}
