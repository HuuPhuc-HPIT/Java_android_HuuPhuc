package bai44_string_bt2_panlyndrome.com;

import java.util.Scanner;

public class TestPanlynDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Moi ban nhap chuoi: ");
		String s= sc.nextLine();
		char []arr=s.toCharArray();
		boolean flag=true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println(s+ "-> la panlyndrome");
		}else {
			System.out.println(s+"-> k phai la panlyndrome");
		}
	}

}
