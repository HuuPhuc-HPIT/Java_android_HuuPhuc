package hpit.com;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Bt3XepGiamDanSoThuc {
	static double[] M;
	public static void nhapMang() {
		System.out.println("Mời bạn nhập số phần tử: ");
		int n = new Scanner(System.in).nextInt();
		M= new double[n];
		Random rd= new Random();
		for(int i=0; i<M.length; i++) {
			M[i]=rd.nextDouble();
		}
		
	}
	public static void xuatMang() {
		DecimalFormat dcf= new DecimalFormat("#.##");
		System.out.println("Các phàn tử trong mảng là: ");
		for(int i=0; i<M.length; i++) {
			System.out.print(dcf.format(M[i])+"\t");
		}
		System.out.println();
	}
	public static void xepMangGiamDan() {
		for(int i=0; i<M.length; i++) {
			for(int j=i+1; j<M.length; j++) {
				if(M[i]<M[j]) {
					double tam=M[i];
					M[i]=M[j];
					M[j]=tam;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang();
		xuatMang();
		xepMangGiamDan();
		xuatMang();
	}

}
