package bai37_string_doichuoi.com;

public class TestDoiChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Xin chao Obama! Ta la Putin!";
		s=s.replace("Obama", "HPIT");
		System.out.println(s);
		
		String s1="HPIT tui la HPIT";
		s1=s1.replaceFirst("HPIT", "Obama");
		System.out.println(s1);
		
		String s2="HPIT tui la HPIT";
		s2=s2.replace("HPIT", "Obama");
		System.out.println(s2);
		
	}

}
