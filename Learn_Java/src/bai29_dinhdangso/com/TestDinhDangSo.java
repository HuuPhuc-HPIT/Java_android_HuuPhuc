package bai29_dinhdangso.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap diem toan: ");
		double toan=sc.nextDouble();
		System.out.println("Nhap diem ly: ");
		double ly=sc.nextDouble();
		System.out.println("Nhap diem hoa: ");
		double hoa=sc.nextDouble();
		double dtb=(toan+ ly+ hoa)/3;
		System.out.println("DTB="+ dtb);
		
		DecimalFormat dcf= new DecimalFormat("#.##");
		System.out.println("DTB= "+ dcf.format(dtb));
	}

}
