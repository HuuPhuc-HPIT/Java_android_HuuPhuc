package bai34_string.com;

import java.util.StringTokenizer;

public class TestChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String();
		String s2= new String("Obama");
		String s3="Obama";
		System.out.println("Chieu dai cua s1= "+ s1.length());
		System.out.println("Chieu dai cua s2= "+ s2.length());
		System.out.println("Chieu dai của s3= "+ s3.length());
		if(s2==s3) {
			System.out.println("s2 bang s3");
		}else {
			System.out.println("s2 k bang s3");
		}
		if(s2.equals(s3)) {
			System.out.println("gia tri s2 bang s3");
		}else {
			System.out.println("gia tri s2 k bang s3");
		}
		
		
	}

}
