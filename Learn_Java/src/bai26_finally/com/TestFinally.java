package bai26_finally.com;

public class TestFinally {

	public static void main(String[] args) {
		try {
			int x=5;
			int y=0;
			int z=x/y;
			System.out.println(z);
			System.out.println("Xin cam on!");
		}catch(Exception ex){
			ex.printStackTrace();
		}finally {
			System.out.println("Chay cuoi cung");
		}
	}

}
