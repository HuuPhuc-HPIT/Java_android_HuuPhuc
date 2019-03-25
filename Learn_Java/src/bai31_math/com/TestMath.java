package bai31_math.com;

import java.util.Scanner;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PI= "+ Math.PI);
		int soNN=Math.min(9, 15);
		System.out.println("so nho nhat:"+ soNN );
		double can=Math.sqrt(25);
		System.out.println("Can cua 25: "+can);
		double gttd= Math.abs(-4);
		System.out.println("|-4|: "+ gttd);
		double lt=Math.pow(3, 4);
		System.out.println("3^4= "+lt);
		
		System.out.println("Moi ban nhap vao 1 goc: ");
		int goc= new Scanner(System.in).nextInt();
		double radian=Math.PI*goc/180;
		double sin=Math.sin(radian);
		double cos=Math.cos(radian);
		double tan=Math.tan(radian);
		double cotan=1/tan;
		
		System.out.println("Sin ("+goc+")= "+ sin);
		System.out.println("Cos ("+ goc+ ")= "+ cos);
	}

}
