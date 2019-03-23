package hpit.com;

import java.util.StringTokenizer;

public class TestTimKiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Không có kính không phải vì xe không có kính xe";
		int vt1=s.indexOf("ô");
		System.out.println("Tim thấy [ô] ở vị trí: "+ vt1);
		int vt2=s.indexOf("xe");
		System.out.println("Tim thấy [xe] ở vị trí: "+ vt2);
		int vt3=s.indexOf("lungtung");
		System.out.println("Vị trí của [lungtung]= "+vt3);
		
		if(vt3==-1) {
			System.out.println("K tim thay [lungtung]");
		}else {
			System.out.println("Tim thay o vi tri: "+ vt3);
		}
		
		int vt4=s.lastIndexOf("ô");
		System.out.println("Tim thấy [ô] ở vị trí thứ: "+vt4);
		
		if(s.contains("xe")==true) {
			System.out.println("Co chữ \"xe\" trong chuoi");
		}else {
			System.out.println("K co chữ \"xe\" trong chuoi");
		}
		
		//Dem lần xuất hiện
		StringTokenizer token= new StringTokenizer(s);
		int dem=0;
		while(token.hasMoreTokens()) {
			String value= token.nextToken();
			if(value.equals("xe")) {
				dem++;
			}
		}
		System.out.println("Tu \"xe\" xua hien "+ dem+ " lan");
	}	

}
