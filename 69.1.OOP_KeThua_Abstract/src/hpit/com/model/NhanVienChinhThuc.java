package hpit.com.model;

public class NhanVienChinhThuc extends NhanVien {

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Nhan vien chinh thuc tinh luong");
		
	}

	public NhanVienChinhThuc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienChinhThuc(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

}
