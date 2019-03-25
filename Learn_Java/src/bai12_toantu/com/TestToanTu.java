package bai12_toantu.com;

public class TestToanTu {

	public static void main(String[] args) {
		double dtb = 3;
		System.out.println(dtb>=5? "Dau" : "Rot");
		
		boolean kq=(5<4)  || (4>3) || (1>2);
		System.out.println(kq);
		
		boolean kq2= (5<4) && (7>3);
		System.out.println(kq2);
		
		int x = 8;
		int y = 2;
		int z = x++ + ++y - 5;
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		System.out.println("z = "+ z);
		
		x = 8;
		x = x++ - ++x ;
		System.out.println("x bang " + x);
		
			x=8;
			y=2;
		int k=3;
		int m = --k - ++x - y++ +2;
		System.out.println("x la "+ x);
		System.out.println("y la "+ y);
		System.out.println("k la "+ k);
		System.out.println("m la "+ m);
		
	}

}
