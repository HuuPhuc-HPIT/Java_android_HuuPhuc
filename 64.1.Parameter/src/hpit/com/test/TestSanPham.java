package hpit.com.test;

import hpit.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		SanPham sp1= new SanPham(1, "coca", 25);
		SanPham sp2= new SanPham(2, "pepsi", 35);
		SanPham sp3= new SanPham(3, "7up", 15);
		
		double t=SanPham.tongTien(sp1, sp2, sp3);
		System.out.println(t);
		
		double t2=SanPham.tongTien(sp2, sp3);
		System.out.println(t2);
	}

}
