package hpit.com;

import java.util.StringTokenizer;

public class TestStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Obama Putin Un";
		StringTokenizer token1= new StringTokenizer(s1);
		while(token1.hasMoreTokens()) {
			String value= token1.nextToken();
			System.out.println(value);
		}
		System.out.println("-----------------");
		String s2="Obama;Putin;Kim Jong Un!HPIT";
		StringTokenizer token2 =new StringTokenizer(s2,";!");
		while(token2.hasMoreTokens()) {
			String value= token2.nextToken();
			System.out.println(value);
		}
		
	}	

}
