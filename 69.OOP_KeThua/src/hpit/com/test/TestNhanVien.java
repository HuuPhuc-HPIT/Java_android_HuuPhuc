package hpit.com.test;

import hpit.com.model.NhanVienChinhThuc;
import hpit.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo= new NhanVienChinhThuc(1, "Nguyen van Teo");
		NhanVienThoiVu Ti= new NhanVienThoiVu(2, "Le van ti");
		teo.tinhLuong();
		Ti.tinhLuong();
		
		
	}

}
