package hpit.com;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Bt1Random_KTrungNhau {
	static int[] M;
	public static void nhapMang() {
		System.out.println("Mời bạn nhập số phần tử: ");
		int n = new Scanner(System.in).nextInt();
		M= new int[n];
		Random rd= new Random();
		for(int i=0; i<M.length; i++) {
			M[i]=rd.nextInt(100);
		}
		
	}
	public static void xuatMang() {
		System.out.println("Các phàn tử trong mảng là: ");
		for(int i=0; i<M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		nhapMang();
		xuatMang();
	}

}
