package hpit.com.test;

import java.util.Scanner;

import hpit.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1, nv2;
		System.out.println("moi ban nhap thong tin nhan vien 1: ");;
		System.out.println("Nhap ho: ");
		String ho1 =new Scanner(System.in).nextLine();
		System.out.println("Nhap ten: ");
		String ten1= new Scanner(System.in).nextLine();
		System.out.println("So san pham: ");
		int soSP1= new Scanner(System.in).nextInt();
		nv1= new NhanVien(ho1, ten1, soSP1);
		System.out.println();
		
		System.out.println("moi ban nhap thong tin nhan vien 2: ");;
		System.out.println("Nhap ho: ");
		String ho2 =new Scanner(System.in).nextLine();
		System.out.println("Nhap ten: ");
		String ten2= new Scanner(System.in).nextLine();
		System.out.println("So san pham: ");
		int soSP2= new Scanner(System.in).nextInt();
		nv2= new NhanVien(ho2, ten2, soSP2);
		System.out.println();
		
		System.out.println("Luong cua nhan vien 1: "+nv1.getLuong());
		System.out.println("Luong cua nhan vien 2: "+nv2.getLuong());
		
		if(nv1.lonHon(nv2)) {
			System.out.println();
			System.out.println("Nhan vien ["+ nv1.getHo()+" "+ nv1.getTen()+"] co nhieu so san pham hon ");
			System.out.println((nv1.getSoSP()-nv2.getSoSP())+" san pham");
		}else {
			System.out.println();
			System.out.println("Nhan vien ["+ nv2.getHo()+" "+ nv2.getTen()+"] co nhieu so san pham hon ");
			System.out.println((nv2.getSoSP()-nv1.getSoSP())+" san pham");
		}
		
		
	}

}
