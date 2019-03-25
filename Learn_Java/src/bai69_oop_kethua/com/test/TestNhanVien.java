package bai69_oop_kethua.com.test;

import bai69_oop_kethua.com.model.NhanVienChinhThuc;
import bai69_oop_kethua.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo= new NhanVienChinhThuc(1, "Nguyen van Teo");
		NhanVienThoiVu Ti= new NhanVienThoiVu(2, "Le van ti");
		teo.tinhLuong();
		Ti.tinhLuong();
		
		
	}

}
