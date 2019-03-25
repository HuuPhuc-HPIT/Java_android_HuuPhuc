package bai51_mang_sapxep.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class TestSapXep {
	public static void nhapMang(int M[]) {
		Random rd= new Random();
		for(int i=0; i<M.length; i++) {
			M[i]=rd.nextInt(100);
		}
	}
	
	public static void xuatMang(int M[]) {
		for(int i=0; i<M.length; i++) {
			System.out.print(M[i]+"\t");
		}
	}
	
	public static void bubbleSort(int[] arr) {  
		int n = arr.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(arr[j-1] > arr[j]){  
					//swap elements  
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;  
				}  

			}  
		}  
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n=sc.nextInt();
		int M[]= new int[n];		
		nhapMang(M);
		
		System.out.println();
		System.out.println("Mang sau khi nhap ngau nhien: ");
		xuatMang(M);
		
		//bubbleSort(M);
		//sap xep dung thu vien co san
		Arrays.sort(M);		
		System.out.println();
		System.out.println("Mang sau khi sap xep: ");
		xuatMang(M);
	}

}
