package bai90_project_quanlidanhba.com.test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bai90_project_quanlidanhba.com.io.SerializeFileFactory;
import bai90_project_quanlidanhba.com.model.Contact;

public class TestContact {
	static HashMap<Integer, Contact> csdl= new HashMap<Integer, Contact>();
	public static void menu() {
		System.out.println("1. Them");
		System.out.println("2. Xuat");
		System.out.println("3. Sua");
		System.out.println("4. Xoa");
		System.out.println("5. Tim");
		System.out.println("6. SapXep");
		System.out.println("7. Luu");
		System.out.println("8. Doc");
		System.out.println("9. Thoat");
		System.out.println("Moi ban chon: ");
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
			sapXep();
			break;
		case 7:
			luu();
			break;
		case 8:
			doc();
			break;
		case 9:
			System.err.println("bye!");
			System.exit(0);
			break;
		
		}
	}
	private static void tim() {
		System.out.println("Nhap phone: ");
		String phone= new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, Contact> item: csdl.entrySet()) {
			if(item.getValue().getPhone().startsWith(phone))
				System.out.println(item.getValue());
		}
	}
	private static void doc() {
		csdl=SerializeFileFactory.readFile("E://csdldanhba.txt");
	}
	private static void luu() {
		boolean kq=SerializeFileFactory.saveFile(csdl, "E://csdldanhba.txt");
		if(kq==true) {
			System.out.println("Luu thanh cong!");
		}else {
			System.out.println("Luu k thanh cong!");
		}
	}
	private static void sapXep() {
		
	}
	private static void xoa() {
		System.out.println("Nhap ma: ");
		int ma= new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)) {
			csdl.remove(ma);
		}else {
			System.out.println("K tim thay ma "+ma+" de xoa!");
		}
	}
	private static void sua() {
		System.out.println("Nhap ma muon sua: ");
		int ma= new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)==true) {
			System.out.println("Nhap ten: ");
			String ten= new Scanner(System.in).nextLine();
			System.out.println("Nhap phone: ");
			String phone= new Scanner(System.in).nextLine();
			
			Contact c= new Contact(ma, ten, phone);
			csdl.put(ma, c);
		}else {
			System.out.println("Ma "+ma+" khong ton tai!");
		}
	}
	private static void xuat() {
		System.out.println("Danh sach danh ba: ");
		for(Map.Entry<Integer, Contact> item: csdl.entrySet()) {
			System.out.println(item.getValue());
		}
	}
	private static void them() {
		System.out.println("Nhap ma: ");
		int ma= new Scanner(System.in).nextInt();
		System.out.println("Nhap ten: ");
		String ten= new Scanner(System.in).nextLine();
		System.out.println("Nhap phone: ");
		String phone= new Scanner(System.in).nextLine();
		
		Contact c= new Contact(ma, ten, phone);
		if(csdl.containsKey(c.getId())==false) {
			csdl.put(c.getId(), c);
		}
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
