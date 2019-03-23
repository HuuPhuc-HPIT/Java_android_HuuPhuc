package hpit.com;

import java.util.Scanner;

public class TetsDeBug {
	public static void Cong(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x= 5;
//		int y= 8;
//		double z=x*1.0/y;
//		System.out.println("z= "+z );
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a=sc.nextInt();
		System.out.println("Nhap b: ");
		int b=sc.nextInt();
		if(a==0 || b==0) {
			System.out.println("1 trong 2 so bang 0");
		}else {
			Cong(a, b);
			System.out.println("Tks");
		}
		
		
		
		
	}

}
