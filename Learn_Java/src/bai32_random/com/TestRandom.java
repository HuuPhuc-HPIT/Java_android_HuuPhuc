package bai32_random.com;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
	public static void game() {
		Random rd= new Random();
		int soMay=rd.nextInt(101);
		System.out.println("May da ra 1 so [0...100] moi ban doan!");
		int soNguoiDoan;
		int soLanDoan = 0;
		do {
			soLanDoan++;
			System.out.println("Ban doan lan thu: "+soLanDoan);
			System.out.println("So ban doan la j?");
			soNguoiDoan = new Scanner(System.in).nextInt();
			if(soNguoiDoan== soMay){
				System.out.println("Ban da WIN!=>so cua may: "+ soMay);
				break;
			}else if(soNguoiDoan< soMay) {
				System.out.println("Ban doan sai: So may > so cua ban");
			}else {
				System.out.println("Ban doan sai: So may < so cua ban");
			}
			
			if(soLanDoan==7) {
				System.out.println("Ban da LOSE vi het 7 lan doan");
				break;
			}
			
		}while(soLanDoan<= 7);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			game();
			System.out.println("Ban co muon tiep tuc (c/k)?");
			String tl= new Scanner(System.in).nextLine();
			if(tl.equalsIgnoreCase("k")) {
				break;
			}
		}
		System.out.println("Bye!");
	}

}
