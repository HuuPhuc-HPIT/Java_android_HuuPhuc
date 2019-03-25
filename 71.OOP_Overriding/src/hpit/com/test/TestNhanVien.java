package hpit.com.test;

import hpit.com.model.NhanVienChinhThuc;
import hpit.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo= new NhanVienChinhThuc();
		teo.tinhLuong(10);
		
		NhanVienThoiVu ti= new NhanVienThoiVu();
		ti.tinhLuong(5);
	}	

}
