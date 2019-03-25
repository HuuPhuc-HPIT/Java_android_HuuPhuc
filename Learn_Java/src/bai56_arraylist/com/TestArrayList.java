package bai56_arraylist.com;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ds= new ArrayList();
		ds.add("1");
		ds.add(new Date("01/01/2000"));
		ds.add("5.5");
		ArrayList<Integer>ds2= new ArrayList<Integer>();
		ArrayList<Double>ds3= new ArrayList<Double>();
		ArrayList<Boolean>ds4= new ArrayList<Boolean>();
		ArrayList<String>ds5= new ArrayList<String>();
		ds5.add("Obama");
		ds5.add("Putin");
		ds5.add("Binladen");
		
		for (int i=0; i<ds5.size(); i++) {
			System.out.println(ds5.get(i));
		}
		
		//Chen
		ds5.add(2, "Kim");
		System.out.println();
		System.out.println("Danh sách sau khi chèn!");
		for (int i=0; i<ds5.size(); i++) {
			System.out.println(ds5.get(i));
		}
		
		//Xoa
		ds5.remove(1);
		System.out.println();
		System.out.println("Danh sách sau khi xóa!");
		for (int i=0; i<ds5.size(); i++) {
			System.out.println(ds5.get(i));
		}
		
		//Sua
		ds5.set(1, "Ho Chi Minh");
		System.out.println();
		System.out.println("Danh sách sau khi sua!");
		for (int i=0; i<ds5.size(); i++) {
			System.out.println(ds5.get(i));
		}
		
		//Xoa het
		ds5.clear();
		System.out.println();
		System.out.println("So phan tu con lai trong ds5 la "+ds5.size());
	}

}
