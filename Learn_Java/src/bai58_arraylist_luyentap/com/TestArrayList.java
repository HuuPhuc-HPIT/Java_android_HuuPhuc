package bai58_arraylist_luyentap.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayList {
	
	static ArrayList<Integer> dsData= new ArrayList<Integer>();
	public static void menu() {
		System.out.println("1. Thêm");
		System.out.println("2. Xuất");
		System.out.println("3. Sửa");
		System.out.println("4. Xóa");
		System.out.println("5. Tìm kiếm");
		System.out.println("6. Sắp xếp");
		System.out.println("7. Thoát!");
		System.out.println("Bạn chọn gì: ");
		int chon= new Scanner(System.in).nextInt();
		switch(chon) {
		case 1:
			them();
			break;
		case 2:
			xuat();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			timKiem();
			break;
		case 6:
			sapXep();
			break;
		case 7:
			System.err.println("Tks ban da su dung!");
			System.exit(0);
			break;
		default:
			System.out.println("Ban chon sai! Vui long chon lai!");
			break;
		}
	}
	private static void sapXep() {
		// TODO Auto-generated method stub
		Collections.sort(dsData);
	}
	private static void timKiem() {
		// TODO Auto-generated method stub
		System.out.println("Mời bạn nhập số cần tìm: ");
		int k= new Scanner(System.in).nextInt();
		if(dsData.contains(k)) {
			System.out.println("Co "+k+" trong danh sach");
		}else {
			System.out.println("Khong co "+k+" trong danh sach!");
		}
	}
	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("Vị trí muốn xóa: ");
		int vt= new Scanner(System.in).nextInt();
		dsData.remove(vt);
	}
	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("Vị trí muốn sửa: ");
		int vt= new Scanner(System.in).nextInt();
		System.out.println("Gía trị mới: ");
		int value = new Scanner(System.in).nextInt();
		dsData.set(vt, value);
	}
	private static void xuat() {
		// TODO Auto-generated method stub
		for(int i=0; i<dsData.size(); i++) {
			System.out.print(dsData.get(i)+"\t");
		}
		System.out.println();
	}
	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("Nhập giá trị muốn thêm: ");
		int value= new Scanner(System.in).nextInt();
		dsData.add(value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			menu();
		}
	}

}
