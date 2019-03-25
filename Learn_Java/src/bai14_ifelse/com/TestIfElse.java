package bai14_ifelse.com;

import java.util.Scanner;

public class TestIfElse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Moi ban nhap vao 1 thang bat ky: ");
		int t=sc.nextInt();
		if(t== 1 || t== 3 || t== 5 || t== 7 || t== 8 || t== 10 || t== 12 ) {
			System.out.println("Thang "+ t +" co 31 ngay");
		}
		else if(t== 4 || t== 6 || t== 9 || t== 11) {
			System.out.println("Thang "+ t +" co 30 ngay");
		}
		else if(t==2) {
			System.out.println("Thang "+ t +" co 30 hoac 31 ngay");
		}
		else {
			System.out.println("Thang ban nhap bi sai");
		}
		
		
	}

}
