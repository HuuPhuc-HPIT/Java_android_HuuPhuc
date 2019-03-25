package bai50_mang_timkiem.com;

import java.util.Scanner;

public class TestTimKiem {
	public static void nhapMang(int M[]) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<M.length; i++) {
			System.out.println("M["+i+"]= ");
			M[i]=sc.nextInt();
		}
	}
	
	public static void xuatMang(int M[]) {
		 for(int i=0; i<M.length; i++) {
			 System.out.print(M[i] +"\t");
		 }
		 System.out.println();
	}
	
	public static void timPhanTu(int M[], int k) {
		boolean timThay=false;
		 for(int i=0; i<M.length; i++) {
			 if(M[i]==k) {
				 timThay= true;
				 break;
			 }
		 }
		 if(timThay==true) {
			 System.out.println("Tim thay "+k+" trong mang");
		 }else {
			 System.out.println("Khong tim thay "+k+" trong mang");
		 }
	}
	
	public static void timSoLanXuatHienPhanTu(int M[], int k) {
		String s="";
		int soLan=0;
		for(int i=0; i<M.length; i++) {
			if(M[i]==k) {
				s+= i+";";
				soLan++;
			}
		}
		if(s.length()>0) {
			System.out.println("Tim thay "+k+" xuat hien "+soLan+" lan!");
			System.out.println("Cac vi tri tim thay: "+s);
		}else {
			System.out.println("K tim thay "+k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Mời bạn nhập số phần tử của mảng: ");
		int n=sc.nextInt();
		int []M= new int[n];
		
		System.out.println("Nhập các giá trị cho mảng: ");
		nhapMang(M);
		
		System.out.println("Mảng sau khi nhập là: ");
		xuatMang(M);
		System.out.println();
		System.out.println();
		System.out.println("Moi ban nhập vào số muốn tìm: ");
		int k=sc.nextInt();
		timPhanTu(M, k);
		
		System.out.println();
		System.out.println("Mời bạn nhấp số khác để tìm: ");
		int x=sc.nextInt();
		timSoLanXuatHienPhanTu(M, x);
	}

}
