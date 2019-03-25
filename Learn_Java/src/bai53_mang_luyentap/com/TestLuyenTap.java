package bai53_mang_luyentap.com;

import java.util.Random;
import java.util.Scanner;

public class TestLuyenTap {
	static int []M; 	
	public static void menu() {
		System.out.println("1. Nhập mảng");
		System.out.println("2. Xuất mảng");
		System.out.println("3. Tổng mảng");
		System.out.println("4. Tìm kiếm");
		System.out.println("5.Lớn nhất");
		System.out.println("6. Nhỏ nhất");
		System.out.println("7. Số nguyên tố");
		System.out.println("8. Xếp tăng dần");
		System.out.println("9. Xếp giảm dần");
		System.out.println("10. Thoat");
		System.out.println("Mời bạn chọn: ");
		
		int chon= new Scanner(System.in).nextInt();
		switch(chon) {
		case 1: 
			nhapMang();
			break;
		case 2:
			xuatMang();
			break;
		case 3: 
			tinhTong();
			break;
		case 4:
			timKiem();
			break;
		case 5:
			timMax();
			break;
		case 6:
			timMin();
			break;
		case 7:
			soNguyenTo();
			break;
		case 8:
			xepTangDan();
			break;
		case 9:
			xepGiamDan();
			break;
		case 10:
			System.err.println("Tks ban da dung phan mem");
			System.exit(0);
		default:
			System.out.println("Ban nhap sai vung menu: ");
			break;
		}
		
	}
	private static void timKiem() {
		// TODO Auto-generated method stub
		System.out.println("Mời bạn nhâp số cần tìm:");
		int k =new Scanner(System.in).nextInt();
		int soLan=0;
		String s="";
		for (int i=0; i<M.length; i++) {
			if(M[i]==k) {
				soLan++;
				s+= i+";";
			}
		}
		if(soLan==0) {
			System.out.println("Không tìm thấy "+k+" trong mảng!");
		}else {
			System.out.println(k+" xuất hiện trong mảng với các vị trí: "+s);
		}
	}
	private static void tinhTong() {
		// TODO Auto-generated method stub
		int sum=0;
		for (int x: M) {
			sum +=x;
		}
		System.out.println("Tổng bằng: "+sum);
	}
	private static void nhapMang() {
		// TODO Auto-generated method stub
		System.out.println("Mời bạn nhập số phần tử: ");
		int n = new Scanner(System.in).nextInt();
		M = new int[n];
		Random rd= new Random();
		for (int i=0; i<M.length; i++) {
			M[i] = rd.nextInt(100);
			
		}
	}
	private static void xuatMang() {
		// TODO Auto-generated method stub
		System.out.println("Các phàn tử trong mảng là: ");
		for(int i=0; i<M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	private static void xepGiamDan() {
		// TODO Auto-generated method stub
		for(int i=0; i<M.length; i++) {
			for(int j=i+1; j<M.length; j++) {
				if(M[i]<M[j]) {
					int tam=M[i];
					M[i]=M[j];
					M[j]=tam;
				}
			}
		}
	}
	private static void xepTangDan() {
		// TODO Auto-generated method stub
		for(int i=0; i<M.length; i++) {
			for(int j=i+1; j<M.length; j++) {
				if(M[i]>M[j]) {
					int tam=M[i];
					M[i]=M[j];
					M[j]=tam;
				}
			}
		}
	}
	private static void soNguyenTo() {
		// TODO Auto-generated method stub
		System.out.println("Các số nguyên tố: ");
		for(int i=0; i<M.length; i++) {
			int dem=0;
			for(int j=1; j<=M[i]; j++) {
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
	private static void timMin() {
		// TODO Auto-generated method stub
		int min=M[0];
		for(int i=1; i<M.length; i++) {
			if(M[i]<min) {
				min=M[i];
			}
		}
		System.out.println("Số nhỏ nhất là: "+min);
	}
	private static void timMax() {
		// TODO Auto-generated method stub
		int max=M[0];
		for(int i=1; i<M.length; i++) {
			if(M[i]>max) {
				max=M[i];
			}
		}
		System.out.println("Số lớn nhất bằng "+max);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			menu();
			System.out.println();
		}
	}

}
