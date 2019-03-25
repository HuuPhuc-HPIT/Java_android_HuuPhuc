package bai82_textfile_baitap.com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import bai82_textfile_baitap.com.io.TextFileFactory;
import bai82_textfile_baitap.com.model.KhachHang;
import bai82_textfile_baitap.com.util.DateConverter;

public class TestKhachHang {
	static ArrayList<KhachHang>dsKH= new ArrayList<KhachHang>();
	public static void menu() {
		System.out.println("1. Nhap");
		System.out.println("2. Xuat");
		System.out.println("3. Luu");
		System.out.println("4. Mo");
		System.out.println("5. Thoat");
		System.out.println("Moi ban chon: ");
		int chon= new Scanner(System.in).nextInt();
		switch(chon) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			luu();
			break;
		case 4:
			mo();
			break;
		case 5:
			System.err.println("TKS!");
			System.exit(0);
			break;
		}
	}
	private static void mo() {
		dsKH=TextFileFactory.readFile("E://dulieukh.txt");
	}
	private static void luu() {
		if(TextFileFactory.saveFile(dsKH, "E://dulieukh.txt")==true) {
			System.out.println("Luu thanh cong!");
		}else {
			System.out.println("Luu khong thanh cong!");
		}
	}
	private static void xuat() {
		for(KhachHang kh: dsKH) {
			System.out.println(kh);
		}
	}
	private static void nhap() {
		System.out.println("Moi ban nhap ma: ");
		int ma= new Scanner(System.in).nextInt();
		System.out.println("Moi ban nhap ten: ");
		String ten= new Scanner(System.in).nextLine();
		System.out.println("Moi ban nhap nam sinh(dd/MM/yyy): ");
		Date ns= DateConverter.fromString(new Scanner(System.in).nextLine());
		
		KhachHang kh= new KhachHang(ma, ten, ns);
		dsKH.add(kh);
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
