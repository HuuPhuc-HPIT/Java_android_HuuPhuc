package hpit.com.test;

import hpit.com.model.NhanVienChinhThuc;
import hpit.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo= new NhanVienChinhThuc(1, "teo teo");
		teo.tinhLuong();
		NhanVienThoiVu ti= new NhanVienThoiVu(2, "ty ty");
		ti.tinhLuong();
	}

}
