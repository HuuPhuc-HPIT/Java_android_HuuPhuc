package bai72_oop_dahinh.com.test;

import bai72_oop_dahinh.com.model.HinhChuNhat;
import bai72_oop_dahinh.com.model.HinhHoc;
import bai72_oop_dahinh.com.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {
		HinhHoc h;
		h= new HinhChuNhat(4, 5);
		System.out.println("Chu vi= "+h.tinhChuVi());
		System.out.println("Dien tich= "+h.tinhDienTich());
		System.out.println();
		System.out.println("------------");
		
		h= new HinhVuong(5);
		System.out.println("Chu vi= "+h.tinhChuVi());
		System.out.println("Dien tich= "+h.tinhDienTich());
		System.out.println();
		System.out.println("------------");
		
		HinhChuNhat hv1= new HinhVuong(7);
		System.out.println("Chu vi= "+hv1.tinhChuVi());
		System.out.println("Dien tich= "+hv1.tinhDienTich());
		System.out.println();
		System.out.println("------------");
		
		
	}

}
