package bai29_dinhdangso.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestDinhDangSynbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=123354684;
		DecimalFormat dcf= new DecimalFormat("#,###");
		DecimalFormatSymbols dcfs= 
				new DecimalFormatSymbols(Locale.getDefault());
		
		dcfs.setGroupingSeparator('.');
		dcf.setDecimalFormatSymbols(dcfs);
		
		
		System.out.println(x);
		System.out.println(dcf.format(x));
	}

}
