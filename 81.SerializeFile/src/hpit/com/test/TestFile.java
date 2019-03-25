package hpit.com.test;


import java.util.ArrayList;

import hpit.com.io.SerializeFileFactory;
import hpit.com.model.KhachHang;

public class TestFile {

	public static void main(String[] args) {
		/*ArrayList<KhachHang>dsKH= new ArrayList<KhachHang>();
		dsKH.add(new KhachHang(1, "Ty"));
		dsKH.add(new KhachHang(2, "Suu"));
		dsKH.add(new KhachHang(3, "Dan"));
		dsKH.add(new KhachHang(4, "Meo"));
		dsKH.add(new KhachHang(5, "Meo"));
		
		boolean kq=SerializeFileFactory.luuFile(dsKH, "E:/data_kh.dat");
		if(kq==true) {
			System.out.println("Luu file thanh cong");
		}else {
			System.out.println("Luu file that bai");
		}*/
		
		Object data=SerializeFileFactory.docFile("E:/data_kh.dat");
		ArrayList<KhachHang>dsKH=(ArrayList<KhachHang>) data;
		for(KhachHang kh: dsKH) {
			System.out.println(kh.getMa()+"-"+kh.getTen());
		}
		
	}

}
