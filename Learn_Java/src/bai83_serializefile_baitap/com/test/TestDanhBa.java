package bai83_serializefile_baitap.com.test;

import java.util.ArrayList;
import java.util.Scanner;

import bai83_serializefile_baitap.com.io.SerializeFile_Factory;
import bai83_serializefile_baitap.com.model.DanhBa;

public class TestDanhBa {
	static ArrayList<DanhBa> dsDB= new ArrayList<DanhBa>();
	public static void menu() {
		System.out.println("1. Nhap");
		System.out.println("2. Xuat");
		System.out.println("3. Luu");
		System.out.println("4. Doc");
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
			doc();
			break;
		case 5:
			System.err.println("bye!");
			System.exit(0);
			break;
		}
	}
	private static void doc() {
		dsDB=SerializeFile_Factory.readFile("E://dulieudanhba.txt");
		xuat();
	}
	private static void luu() {
		boolean kq=SerializeFile_Factory.saveFile(dsDB, "E://dulieudanhba.txt");
		if(kq==true) {
			System.out.println("Luu thanh cong!");
		}else {
			System.out.println("Luu k thanh cong!");
		}
	}
	private static void xuat() {
		System.out.println("danh sach danh ba: ");
		for(DanhBa db: dsDB) {
			System.out.println(db);
		}
	}
	private static void nhap() {
		System.out.println("Nhap ten: ");
		String ten= new Scanner(System.in).nextLine();
		System.out.println("Nhap phone: ");
		String phone= new Scanner(System.in).nextLine();
		DanhBa db= new DanhBa(ten, phone);
		dsDB.add(db);
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
