import java.util.*;

public class ThePropertiesClass {
	
	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Properties capitals = new Properties();
		Set states;
		String str;
		
		capitals.put("RD", "Santo Domingo");
		capitals.put("Cibao", "Santiago");
		capitals.put("Hong Kong", "Hong Kong");
		
		states = capitals.keySet();
		Iterator itr = states.iterator();
		while(itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("Capital city of "+ str +" is "+ capitals.getProperty(str) );
		}
		print("");
		
		str = capitals.getProperty("AnCapolis", "Not Found");
		print("The capital of AnCapolis is " +str);
	}
}