package hpit.com.test;

import java.util.ArrayList;

import hpit.com.io.FileFactory;



public class TestFile {

	public static void main(String[] args) {
		
		//Luu file
		/*ArrayList<String>dsData= new ArrayList<String>();
		dsData.add("Obama");
		dsData.add("putin");
		dsData.add("ho chi minh");
		
		boolean kq= FileFactory.luuFile(dsData, "E:/dulieutest.txt");
		if(kq==true) {
			System.out.println("luu file thanh cong");
		}else {
			System.out.println("Luu File that bai" );
		}*/
		
		//Doc File
		ArrayList<String>dsData= FileFactory.docFile("E:/dulieutest.txt");
		for(String data: dsData) {
			System.out.println(data);
		}
	}

}
