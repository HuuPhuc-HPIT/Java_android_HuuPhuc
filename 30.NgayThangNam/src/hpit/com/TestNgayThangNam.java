package hpit.com;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestNgayThangNam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lay ngay gio hien tai he thong
		Calendar cal= Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);
		int month=cal.get(Calendar.MONTH);
		System.out.println(month+1);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int date=cal.get(Calendar.DATE);
		System.out.println(date);
		
		Date t= cal.getTime();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(t));
		
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		System.out.println(sdf1.format(t));
		
		SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf2.format(t));
		
		SimpleDateFormat sdf3= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		System.out.println(sdf3.format(t));
		

	}

}
