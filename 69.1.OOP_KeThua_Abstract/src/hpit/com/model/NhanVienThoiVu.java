package hpit.com.model;

public class NhanVienThoiVu extends NhanVien{

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Nhan vien thoi vu tinh luong");
	}

	public NhanVienThoiVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienThoiVu(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}
	

}
