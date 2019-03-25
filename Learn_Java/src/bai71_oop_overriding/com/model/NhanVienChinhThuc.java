package bai71_oop_overriding.com.model;

public class NhanVienChinhThuc extends NhanVien {

	public void tinhLuong (int ngayCong) {
		// TODO Auto-generated method stub
		if(ngayCong<20) {
			System.out.println("5 chai");
		}else {
			System.out.println("10 chai");
		}
	}
	
}
