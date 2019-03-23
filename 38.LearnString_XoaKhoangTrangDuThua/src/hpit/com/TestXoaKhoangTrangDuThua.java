package hpit.com;

public class TestXoaKhoangTrangDuThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Xoa khoang trang du thua
		String s="  Nguyen Huu Phuc";
		System.out.println(s);
		System.out.println("=>Chieu dai bang: "+s.length());
		s=s.trim();
		System.out.println(s);
		System.out.println("=>Chieu dai la: "+s.length());
		
		//Xoa khoang trang du thua ben trai
		s="   Hello Obama alo Putin    ";
		int vtLeft=0;
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(c==' ') {
				vtLeft=i;
			}else {
				break;
			}
		}
		s=s.substring(vtLeft+1);
		System.out.println(s);
	
		//Xoa khoang trang du thua ben phai
		String s1="   Hello Obama alo Putin    ";
		int vtRight=0;
		for(int i=s.length(); i>=1; i--) {
			char cR=s1.charAt(i);
			if(cR==' ') {
				vtRight=i;
			}else {
				break;
			}
		}
		s1=s1.substring(0, vtRight);
		System.out.println(s1);
	}

	

}
