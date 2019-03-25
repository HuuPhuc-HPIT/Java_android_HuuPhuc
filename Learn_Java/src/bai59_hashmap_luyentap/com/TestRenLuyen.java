package bai59_hashmap_luyentap.com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestRenLuyen {
	static HashMap<Integer, String> map= new HashMap<Integer, String>();
	public static void menu() {
		System.out.println("1. Thêm");
		System.out.println("2. Xuất");
		System.out.println("3. Sửa");
		System.out.println("4. Xóa ");
		System.out.println("5. Tìm kiếm");
		System.out.println("6. Thoát");
		System.out.print("Mời bạn chọn: ");
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
			tim();
			break;
		case 6:
			System.err.println("Tks!");
			System.exit(0);
			break;
		default:
			System.out.println("Ban nhap sai! Vui long nhap lai!");
			break;
		}
	}
	private static void tim() {
		//Lọc tất cả cuốn sách có từ "java"
		System.out.print("Nhập tên sách muôn tìm: ");
		String ten= new Scanner(System.in).nextLine();
		for(Entry<Integer, String> item: map.entrySet()) {
			if(item.getValue().contains(ten)) {
				System.out.println(item.getKey()+"-"+item.getValue());
				
			}
		}
	}
	private static void xuat() {
		
		System.out.println("Mã \t Tên sách");
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey()+" \t "+item.getValue());
		}
	}
	private static void xoa() {
		System.out.print("Mời bạn nhập mã muốn xóa: ");
		int ma= new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false) {
			System.out.println("Mã k đúng");
		}else {
			map.remove(ma);
		}
	}
	private static void sua() {
		System.out.print("Mời bạn nhập mã muốn sửa: ");
		int ma= new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false) {
			System.out.println("Mã" +ma+ "không tồn tại!");
		}else {
			System.out.print("Nhập tên sách mới: ");
			String ten= new Scanner(System.in).nextLine();
			map.put(ma, ten);
		}
	}
	private static void them() {
		System.out.println("Nhập mã sách:");
		int ma= new Scanner(System.in).nextInt();
		System.out.println("Nhập tên sách: ");
		String ten= new Scanner(System.in).nextLine();
		if(map.containsKey(ma)==false) {
			map.put(ma, ten);		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			menu();
		}
	}

}
