import java.util.*;

public class TheHashtableClass {

	public static void main(String[] args) {
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;
		
		balance.put("Zara", new Float(3434.34));
		balance.put("Mary", new Double(123.22));
		balance.put("Jane", new Double(1377.00));
		balance.put("Robert", new Double(7948.73));
		
		names = balance.keys();
		while(names.hasMoreElements()){
			str = (String) names.nextElement();
			System.out.println(str +": "+ balance.get(str));
			
		}
		System.out.println();
		
		bal = ((Double) balance.get("Robert")).doubleValue();
		balance.put("Robert", new Double(bal + 1000));
		System.out.println("Robert's new balance: " +balance.get("Robert"));
	}

}
