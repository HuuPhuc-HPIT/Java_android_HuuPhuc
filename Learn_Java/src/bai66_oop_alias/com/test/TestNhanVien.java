package bai66_oop_alias.com.test;

import bai66_oop_alias.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1= new NhanVien(1, "Obama");
		NhanVien nv2= new NhanVien(2, "Putin");
		nv1= nv2;
		System.out.println("Ten cua nhan vien 1= "+nv1.getTen());
		System.out.println("Ten cua nhan vien 2= "+nv2.getTen());
				
		nv2.setTen("Kim");
		System.out.println("Ten cua nhan vien 1= "+nv1.getTen());
		System.out.println("Ten cua nhan vien 2= "+nv2.getTen());
		
		
		nv1.setTen("ho chi minh");
		System.out.println("Ten cua nhan vien 2= "+nv2.getTen());
		System.out.println("Ten cua nhan vien 1= "+nv1.getTen());
		
		NhanVien nv3= new NhanVien(3, "vo nguye giap");
		NhanVien nv4= new NhanVien(4, "nguyen sinh cung");
		
		nv3=nv4.copy();
		System.out.println("Ten cua nhan vien 3= "+nv3.getTen());
		System.out.println("Ten cua nhan vien 4= "+nv4.getTen());
		
		nv4.setTen("Ti");
		System.out.println("Ten cua nhan vien 3= "+nv3.getTen());
		System.out.println("Ten cua nhan vien 4= "+nv4.getTen());
		
		nv3.setTen("Teo");
		System.out.println("Ten cua nhan vien 3= "+nv3.getTen());
		System.out.println("Ten cua nhan vien 4= "+nv4.getTen());
		
	}

}
