package bai64_oop_overloadingmethod.com.test;

import bai64_oop_overloadingmethod.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien teo=new SinhVien(1, "Le van teo", 9);
		teo.xetTotNghiep();
		teo.xetTotNghiep(5);
		teo.xetTotNghiep(8, 1);
	}

}
