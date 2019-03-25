package bai41_string_tachchuoi.com;

public class TestTachChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="SV0001; Nguyen Van A; CP201828L";
//		String []arr=s.split(";");
		String s="SV0001. Nguyen Van A. CP201828L";
		String []arr=s.split("\\.");
		if(arr.length==3) {
			System.out.println("Ma: "+ arr[0]);
			System.out.println("Ten: "+ arr[1]);
			System.out.println("Lop: "+ arr[2]);
		}
		System.out.println("---------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------");
		for(String x : arr) {
			System.out.println(x);
		}
	}

}
