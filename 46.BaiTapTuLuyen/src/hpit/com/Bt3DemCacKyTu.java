package hpit.com;

import java.util.Scanner;

public class Bt3DemCacKyTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("Moi ban nhap 1 chuoi: ");
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		int count=0;
		
		//Dem so phu am
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'u' ||
					s.charAt(i) == 'U' ||
						s.charAt(i) == 'o' ||
							s.charAt(i) == 'O' ||
								s.charAt(i) == 'a' ||
									s.charAt(i) == 'A' ||
										s.charAt(i) == 'e' ||	
											s.charAt(i) == 'E' ||
												s.charAt(i) == 'i' ||
													s.charAt(i) == 'I') {
				count++;
			}
		}		
		System.out.println("So phu am la: "+count);
		
		//Dem khoang trang
		int countKhoangTrang=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				countKhoangTrang++;
			}
		}
		System.out.println("So khoang trang: "+countKhoangTrang);
		
		//Dem chu so
		int countChuSo=0;
		for(int i =0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				countChuSo++;
			}
		}
		System.out.println("So chu so: "+countChuSo);
		
		//Dem chu in thuong
		int countChuInThuong=0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				countChuInThuong++;
			}
		}
		System.out.println("So chu in thuong: "+countChuInThuong);
		
		//Dem chu in hoa
		int countChuInHoa=0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				countChuInHoa++;
			}
		}
		System.out.println("So chu in hoa: "+countChuInHoa);
		
		//Dem ki tu dac biet
		int countKiTuDacBiet=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '!' || 
					s.charAt(i) == '@' ||
						s.charAt(i) == '#' ||
							s.charAt(i) == '$' ||
								s.charAt(i) == '%' ||
									s.charAt(i) == '^' ||
										s.charAt(i) == '&' ||
											s.charAt(i) == '*') {
				countKiTuDacBiet++;
			}
		}
		System.out.println("So ki tu dac biet: "+countKiTuDacBiet);
		
		//Dem so nguyen am
		int countSoNguyenAm= s.length()-count-countChuSo-countKiTuDacBiet-countKhoangTrang;
		System.out.println("So nguyen am: "+countSoNguyenAm);
	}

}
