package hpit.com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import hpit.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		ArrayList<SanPham>dsSP= new ArrayList<SanPham>();
		dsSP.add(new SanPham(1, "coca", 25));
		dsSP.add(new SanPham(2, "pepsi", 20));
		System.out.println("danh sach san pham: ");
		for(SanPham sp: dsSP) {
			System.out.println(sp);
		}
		
		Collections.sort(dsSP);
		System.out.println("danh sach san pham sau khi sap xep: ");
		for(SanPham sp: dsSP) {
			System.out.println(sp);
		}
	}

}
