package hpit.com.model;

public class SinhVien {
	private int ma;
	private String ten;
	private double diemTrungBinh;
	private XepLoai loai;
	
	public SinhVien(int ma, String ten, double diemTrungBinh) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diemTrungBinh = diemTrungBinh;
		this.loai=getLoai();
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public XepLoai getLoai() {
		if(this.diemTrungBinh>=8) {
			loai=XepLoai.Gioi;
		}else if(this.diemTrungBinh>=6.5) {
			loai=XepLoai.Kha;
		}else if(this.diemTrungBinh>=5){
			loai=XepLoai.TrungBinh;
		}else {
			loai=XepLoai.Yeu;
		}
		return loai;
	}
	@Override
	public String toString() {
		return this.ma+"\t"+this.ten+"\t"+this.diemTrungBinh+"\t=>"+this.loai.description();
	}
}
