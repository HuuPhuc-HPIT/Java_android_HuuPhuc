package bai62_oop.com.modal;

public class SinhVien {
	private String hoTen;
	private double diem;
	public void setHoTen (String hoTen) {
		this.hoTen= hoTen;
	}
	public String getHoTen() {
		return this.hoTen;
		
	}
	public void setDiem(Double diem) {
		this.diem= diem;
	}
	public double getDiem() {
		return this.diem;
	}
	public SinhVien(String hoTen, double diem) {
		this.hoTen= hoTen;
		this.diem= diem;
		System.out.println("Đây là Constructor có đối số");
	}
	public SinhVien() {
		System.out.println("Đây là constructor mặc định");
		this.hoTen="tui la obama";
	}
	public void xuatThongTin() {
		System.out.println(this.hoTen +" -> "+this.diem);
	}
	public String toString() {
		return "ho ten= "+this.hoTen+ " 	Diem= "+this.diem;
	}
}
