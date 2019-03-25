package bai72_oop_dahinh.com.test;

import bai72_oop_dahinh.com.model.IDoable;
import bai72_oop_dahinh.com.model.NhanVien;
import bai72_oop_dahinh.com.model.SinhVien;

public class TestDouble {

	public static void main(String[] args) {
		IDoable x;
		x= new NhanVien();
		x.doSomething();
		
		x= new SinhVien();
		x.doSomething();
	}

}
