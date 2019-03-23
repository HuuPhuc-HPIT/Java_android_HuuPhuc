package hpit.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bt3TinhTuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal= Calendar.getInstance();
		int yearNow= cal.get(Calendar.YEAR);
		
		System.out.println("Moi ban nhap nam sinh theo dd/MM/yyyy: ");
		String ns= new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date birthday = sdf.parse(ns);
			cal.setTime(birthday);
			int yearNs=cal.get(Calendar.YEAR);
			
			int tuoi= yearNow- yearNs;
			
			System.out.println("Ban "+tuoi+" tuoi");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
