package bai15_switch.com;

import java.util.Scanner;

public class TestSwitchBienThe {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Moi ban nhap mot thang bat ky: ");
		int t=sc.nextInt();
		switch(t) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang "+ t +" co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang "+ t +" co 30 ngay");
			break;
		case 2:
			System.out.println("Moi ban nhap nam: ");
			int y=sc.nextInt();
			if((y%4==0 && y%100!=0) || y%400==0) {
				System.out.println("Nam "+ y +" la nam nhuan => Thang "+ t +" co 29 ngay");
			}
			else {
				System.out.println("Nam "+ y +" la nam k nhuan => Thang "+ t +" co 28 ngay");
			}
			break;
		default:
			System.err.println("Ban nhap sai thang!");
			break;
		}
	}

}
