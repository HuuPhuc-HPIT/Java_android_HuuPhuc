package hpit.com;

public class TestChuHoaThuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PUTIN".toLowerCase();
		System.out.println(s);
		
		String s1="Obama";
		s1=s1.toUpperCase();
		System.out.println(s1);
		
		//Chu dau tien in HOA
		s1="obama";
		s1=s1.replaceFirst("o", "o".toUpperCase());
		System.out.println(s1);
		
		s1="putin";
		s1=s1.replaceFirst((s1.charAt(0)+""), (s1.charAt(0)+"").toUpperCase());
		System.out.println(s1);
		
		//Tu dong in hoa ki tu dau va in thuong cac ki tu con lai
		
		String s2="HOCHIMINH";
		s2=s2.toLowerCase();
		s2=s2.replaceFirst((s2.charAt(0)+""), (s2.charAt(0)+"").toUpperCase());
		System.out.println(s2);
	}

}
