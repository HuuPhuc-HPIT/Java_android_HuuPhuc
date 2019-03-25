package bai52_mang_hanche.com;

public class TestHanChe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []M= {5,2,3,6,8};
		System.out.println(M[4]);
		 
		//Xoa 1 phan tu
		int []M2= new int [M.length-1];
		M2[0]=M[0];
		M2[1]=M[2];
		M2[2]=M[3];
		M2[3]=M[4];
		for(int i=0; i<M2.length; i++) {
			System.out.print(M2[i]+"\t");
		}
	}

}
