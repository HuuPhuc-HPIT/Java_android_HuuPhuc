package hpit.com;

import java.util.Scanner;

public class TestSwitchToanHoc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Nhap so a: ");
			int a=sc.nextInt();
			System.out.println("Nhap so b: ");
			int b=sc.nextInt();
			System.out.println("Moi ban nhap phep toan: ");
			char ch= new Scanner(System.in).nextLine().charAt (0);
			switch(ch) {
			case '+':
				System.out.println(a+ " + "+ b+ " = "+ (a+b));
				break;
			case '-':
				System.out.println(a+ " - "+ b+ " = "+ (a-b));
				break;		
			case '*':
				System.out.println(a+ " * "+ b+ " = "+ (a*b));
				break;
			case '/':
				if(b==0)
					System.err.println("Mau= 0");
				else
					System.out.println(a+ "/"+ b+ " = "+ (a*1.0/b));
				break;
			default:
				System.out.println("Phep toan k trung hop!");
				break;
			}
			
			System.out.println("Tiep hay nghi? (c/k):");
			String line= new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("k"))
				break;
		}
		System.out.println("Tks!");
	}

}
