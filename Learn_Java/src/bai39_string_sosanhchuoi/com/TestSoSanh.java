package bai39_string_sosanhchuoi.com;

public class TestSoSanh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="an";
		String s2="AN";
		int kq=s1.compareTo(s2);
		System.out.println(kq);
		
		int kq2=s1.compareToIgnoreCase(s2);
		System.out.println(kq2);
		
		if(s1.equals(s2)) {
			System.out.println("S1=S2");
		}else {
			System.out.println("s1!=s2");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("S1= S2");
		}else {
			System.out.println("S1!=S2");
		}
		
	}

}
