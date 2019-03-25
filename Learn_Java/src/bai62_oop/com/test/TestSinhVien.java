package bai62_oop.com.test;

import bai62_oop.com.modal.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien obama= new SinhVien();
		SinhVien putin= new SinhVien("tui la putin", 8);
		 
		 //
		System.out.println("Diem cua putin " +putin.getDiem());
		System.out.println("Ten cua putin "+putin.getHoTen());
		System.out.println("Ten obama: "+obama.getHoTen());
		
		obama.setHoTen("Ong obama");
		System.out.println("Ten obama: 	"+obama.getHoTen());
		
		System.out.println("-------");
		putin.xuatThongTin();
		
		System.out.println("-----------");
		System.out.println(putin);
		 
	}

}
