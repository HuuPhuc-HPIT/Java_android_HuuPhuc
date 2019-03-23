package hpit.com;

public class TestToiUuChuoi {
	
	public static String toiUU(String s) {
		String sToiTuu= s;
		sToiTuu=sToiTuu.trim();
		String []arrWord=sToiTuu.split(" ");
		sToiTuu="";
		for(String word : arrWord) {
			String newWord=word.toLowerCase();
			if(newWord.length()>0) {
				 newWord=newWord.replaceFirst(newWord.charAt(0)+"", (newWord.charAt(0)+"").toUpperCase());
				 sToiTuu+=newWord+" ";
			}
		}
		return sToiTuu.trim();
	}
	public static void main(String[] args) {
		String s="  NguyeN    HUU   phUc   ";
		System.out.println(s);
		String sToiUuu=toiUU(s);
		System.out.println(sToiUuu);
	}

}
