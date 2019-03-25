package hpit.com.test;

import java.util.ArrayList;

import hpit.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		ArrayList<SinhVien>dsSV= new ArrayList<SinhVien>();
		dsSV.add(new SinhVien(1, "teo", 6));
		dsSV.add(new SinhVien(2, "ty", 7));
		dsSV.add(new SinhVien(3, "heo", 2));
		dsSV.add(new SinhVien(4, "vit", 9));
		System.out.println("danh sach sinh vien");
		for( SinhVien sv: dsSV) {
			System.out.println(sv);
		}
	}

}
