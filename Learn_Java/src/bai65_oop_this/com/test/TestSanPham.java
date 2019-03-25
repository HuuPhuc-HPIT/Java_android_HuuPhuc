package bai65_oop_this.com.test;

import bai65_oop_this.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1= new SanPham();
		sp1.setMa(1);
		sp1.setTen("Coca");
		sp1.setGia(15);
		System.out.println(sp1);
	}

}
