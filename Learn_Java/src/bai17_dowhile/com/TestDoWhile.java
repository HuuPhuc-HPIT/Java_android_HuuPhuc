package bai17_dowhile.com;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Moi ban nhap 1 so: ");
		int n= sc.nextInt();
		int gt=1;
		int i= 1;
		do {
			gt*= i;
			i++;
		}
		while(i<= n);
		System.out.println(n+ "!= "+ gt);
	}

}
