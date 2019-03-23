package hpit.com;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder();
		sb.append("Hello");
		sb.append("\n");
		sb.append("France");
		sb.append("Vietnam");
		sb.insert(5, "abc");
		
		String s=sb.toString();
		System.out.println(s);
		
		sb.delete(5, 7);
		s=sb.toString();
		System.out.println(s);
	}	

}
