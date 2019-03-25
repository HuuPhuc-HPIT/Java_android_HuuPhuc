package bai71_oop_overriding.com.test;

import bai71_oop_overriding.com.model.NhanVienChinhThuc;
import bai71_oop_overriding.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo= new NhanVienChinhThuc();
		teo.tinhLuong(10);
		
		NhanVienThoiVu ti= new NhanVienThoiVu();
		ti.tinhLuong(5);
	}	

}
