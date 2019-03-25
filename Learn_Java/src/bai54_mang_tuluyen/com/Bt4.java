package bai54_mang_tuluyen.com;

import java.util.Scanner;

public class Bt4 {
	static int []M;
	
	public static void nhapMang() {
		System.out.println("Mời bạn nhập số phần tử: ");
		int n = new Scanner(System.in).nextInt();
		M= new int[n];
		System.out.println("Nhập phần tử cho mảng ");
		for(int i=0; i<M.length; i++) {
			System.out.println("Phần tử thứ " +(i+1)+": ");
			M[i]=new Scanner(System.in).nextInt();
		}
	}
	
	public static void xuatMang() {
		System.out.println("Các phàn tử trong mảng là: ");
		for(int i=0; i<M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	public static void soLe() {
		int soLan=0;
		System.out.print("Cac so lẻ là: ");
		for(int i=0; i<M.length; i++) {
			if(M[i]%2!=0) {
				soLan++;
				System.out.print(M[i]+"\t");
			}
		}
		System.out.print("và xuất hiện "+soLan+" lần!");
	}
	
	public static void soChan() {
		int soLan=0;
		System.out.print("Cac so chẵn là: ");
		for(int i=0; i<M.length; i++) {
			if(M[i]%2==0) {
				soLan++;
				System.out.print(M[i]+"\t");
			}
		}
		System.out.print("và xuất hiện "+soLan+" lần!");
	}
	
	public static void soNguyenTo() {
		System.out.println("Các số nguyên tố: ");
		for(int i=0; i<M.length; i++) {
			int dem=0;
			for(int j=1; j<M[i]; j++) {
				if(M[i]%j==0) {
					dem++;
				}
			}
			if(dem==2) {
				System.out.print(M[i]+"\t");
			}
		}
		System.out.println();
	}
	
	public static void soKhongLaNguyenTo() {
		System.out.println("Các số không phải là nguyên tố: ");
		for(int i=0; i<M.length; i++) {
			int dem=0;
			for(int j=1; j<M[i]; j++) {
				if(M[i]%j==0) {
					dem++;
				}
			}
			if(dem!=2) {
				System.out.print(M[i]+"\t");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang();
		xuatMang();
		System.out.println();
		soLe();
		System.out.println();
		soChan();
		System.out.println();
		soNguyenTo();
		System.out.println();
		soKhongLaNguyenTo();
	}

}
