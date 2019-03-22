package hpit.com;

public class TestTryCatch {

	public static void main(String[] args) {
		try {
			int x= 5;
			int y= 5/10;
			System.out.println("x= "+ x);
			System.out.println("y= "+ y);
			int z=x/y;
			System.out.println("z= "+ z);
			
		}catch(Exception ex) {
			System.out.println("Co loi");
			ex.printStackTrace();
		}
		System.out.println("Tks!");
	}

}
