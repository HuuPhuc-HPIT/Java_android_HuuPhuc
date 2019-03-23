package hpit.com;

import java.util.Random;
import java.util.Scanner;

public class Bt1RandomGame {
	public static void game() {
		int diemKhoiTao= 5;
		System.out.println("Game tang ban "+ diemKhoiTao+ " diem!");
		Random rd= new Random();
		int soMay=rd.nextInt(6);
		System.out.println("May tao ra 1 so trong [0...5] moi ban doan!");
		int soNguoiDoan;
		int soLanDoan=0;
		int diemNguoiChoi= diemKhoiTao;
		do {
			soLanDoan++;
			System.out.println("Lan doan thu "+soLanDoan);
			System.out.println("Moi ban nhap so ban doan: ");
			soNguoiDoan= new Scanner(System.in).nextInt();
			if(soNguoiDoan==soMay) {
				diemNguoiChoi += 1;
				System.out.println("Ban da doan dung=> Diem cua ban la: " +diemNguoiChoi);
				soMay=rd.nextInt(6);
				System.out.println("May tao ra 1 so trong [0...5] moi ban doan!");
				
			}else {
				diemNguoiChoi -=1;
				System.out.println("Ban doan sai=> Diem cua ban la: "+diemNguoiChoi);
			}
			if(diemNguoiChoi==0) {
				System.out.println("Ban da thua!");
				break;
			}
			if(diemNguoiChoi==10) {
				System.out.println("Ban da thang!");
				break;
			}
		}while(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			game();
			System.out.println("Ban co muon choi tiep k (c/k)?");
			String line=new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("k")) {
				System.out.println("Tks!");
				break;
				
			}
		}

	}

}
