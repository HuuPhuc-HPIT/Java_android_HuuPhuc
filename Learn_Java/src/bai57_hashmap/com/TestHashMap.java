package bai57_hashmap.com;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "An");
		map.put(2, "Binh");
		map.put(3, "Hanh");
		map.put(4, "Phuc");
		map.put(5, "Giai");
		map.put(6, "Thoat");
		//Lay toan bo ten
		Collection<String> dsTen= map.values();
		for(String ten: dsTen) {
			System.out.println(ten);
		}
		
		
		System.out.println();
		System.out.println("Danh sach ma: ");
		Set<Integer> dsMa= map.keySet();
		for(int ma: dsMa) {
			System.out.println(ma);
		}
		
		String tenPhuc=map.get(4);
		System.out.println(tenPhuc);
		System.out.println();
		
		System.out.println("-----------------------");
		if(map.containsKey(7)==false) {
			map.put(7, "lala");
		}				
		Collection<String> dsTen1= map.values();
		for(String ten: dsTen1) {
			System.out.println(ten);
		}	
		
		//xoa ten
		map.remove(2);
		System.out.println();
		System.out.println("Danh sach sau khi xoa!");
		Collection<String> dsTen2= map.values();
		for(String ten: dsTen2) {
			System.out.println(ten);
		}	
		
		//Xoa het
		map.clear();
		System.out.println();
		System.out.println("So phan tu con lai: "+map.size());
	}	

}
