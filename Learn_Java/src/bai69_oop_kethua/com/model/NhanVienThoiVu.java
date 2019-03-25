package bai69_oop_kethua.com.model;

public class NhanVienThoiVu extends NhanVien{
	public NhanVienThoiVu() {
		super();
	}
	public NhanVienThoiVu(int ma, String ten) {
		super(ma, ten);
	}
	public void tinhLuong() {
		super.tinhLuong();
		System.out.println("==> day la nhan vien thoi vu");
	}
}
