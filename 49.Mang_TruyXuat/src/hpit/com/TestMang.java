package hpit.com;

import java.util.Scanner;

public class TestMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int []M;
		System.out.println("Nhap phan tu toi da: ");
		int n=sc.nextInt();
		//cap phat n phan tu cho mang M
		M= new int[n];
		//Nhập liệu cho từng phần tử trong mảng
		System.out.println("Nhap gia tri cho mang:");
		for(int i=0; i<M.length; i++) {
			System.out.print("M["+i+"]= ");
			M[i]=sc.nextInt();
		}
		System.out.println("Mảng sau khi đã nhập là: ");
		for(int i=0; i<M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
		
		System.out.println("Xuất mảng theo giá trị: ");
		for(int i: M) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//
		M[2]=112;
		System.out.println("Mảng sau khi đã nhập là: ");
		for(int i=0; i<M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}

}
