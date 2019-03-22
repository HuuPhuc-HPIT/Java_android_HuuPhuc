package hpit.com;

import java.util.Scanner;

public class Bt3KiemTraSoChan {

	public static boolean soChan(int n) {
		while(n>0) {
			if(n%10%2!= 0) {
				return false;
			}else {
				n=n/10;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao so n: ");
		int n= sc.nextInt();
		
		while(n<0) {
			System.out.println("Nhap lai so n: ");
			n= sc.nextInt();
		}
		
		if(soChan(n)==true) {
			System.out.println("So "+ n+ " la so chan");
		}else {
			System.out.println("So "+ n+ " la so le");
		}
		
	}

}
