package communityuni.com;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap du lieu: ");
		int a=sc.nextInt();
		System.out.println("Ban vua nhap: "+a);
		
		System.out.println("Nhap kieu so thuc: ");
		double b=sc.nextDouble();
		System.out.println("Ban vua nhap so: "+b);
		
		System.out.println("Moi ban nhap chuoi: ");
		//String line=new Scanner(System.in).nextLine();
		Scanner li= new Scanner(System.in);
		String line= li.nextLine();
		
		System.out.println("Chuoi ban vua nhap la: "+line);
	}

}
