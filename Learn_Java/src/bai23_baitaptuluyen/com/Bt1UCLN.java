package bai23_baitaptuluyen.com;

import java.util.Scanner;

public class Bt1UCLN {
	
	public static int UCLN(int a, int b) {
		while(a!= b) {
			if(a>b) {
				a -= b;
			}else {
				b -=a;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so a: ");
		int a=sc.nextInt();
		System.out.println("Nhap so b: ");
		int b=sc.nextInt();
		
		while((a<=0) || (b<=0)) {
			System.out.println("Nhap lai 2 so a va b: ");
			System.out.println("Nhap so a: ");
			a=sc.nextInt();
			System.out.println("Nhap so b: ");
			b=sc.nextInt();
		}
		
		System.out.println("UCLN cua "+ a+ " va "+ b+" la " +UCLN(a, b));
	}

}
