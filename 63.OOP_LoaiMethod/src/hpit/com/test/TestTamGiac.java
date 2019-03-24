package hpit.com.test;

import hpit.com.model.TamGiac;

public class TestTamGiac {

	public static void main(String[] args) {
		TamGiac tg1= new TamGiac(8, 12, 18);
		System.out.println("chu vi= "+tg1.tinhChuVi());
		System.out.println("Dien tich= "+tg1.tinhDienTich());
		
		
	}

}
