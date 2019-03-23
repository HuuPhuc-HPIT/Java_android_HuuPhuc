package hpit.com;

public class TestTachTenBaiHat {
	public static String tenBaiHatCoMp3(String duongDanBaiHat) {
		int vtCuoi=duongDanBaiHat.lastIndexOf("/");
		String tenBaiHat=duongDanBaiHat.substring(vtCuoi+1);
		return tenBaiHat;
	}
	
	public static String tenBaiHatKoMp3(String duongDanBaihat) {
		int vtCuoi1=duongDanBaihat.lastIndexOf("/");
		int vtCuoi2=duongDanBaihat.lastIndexOf(".");
		String tenBaiHat=duongDanBaihat.substring((vtCuoi1+1), (vtCuoi2));
		return tenBaiHat;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String duongDanBaiHat="D:/abc/cba/mudic/bonghong.mp3";
		String kq=tenBaiHatCoMp3(duongDanBaiHat);
		System.out.println(kq);
		
		
		String kq2=tenBaiHatKoMp3(duongDanBaiHat);
		System.out.println(kq2);
	}

}
