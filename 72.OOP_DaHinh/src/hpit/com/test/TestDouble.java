package hpit.com.test;

import hpit.com.model.IDoable;
import hpit.com.model.NhanVien;
import hpit.com.model.SinhVien;

public class TestDouble {

	public static void main(String[] args) {
		IDoable x;
		x= new NhanVien();
		x.doSomething();
		
		x= new SinhVien();
		x.doSomething();
	}

}
