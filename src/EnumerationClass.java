import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {
	public static void main(String args[]){
		Enumeration fruits;
		Vector fruitNames = new Vector();
				
		fruitNames.add("Coconut");
		fruitNames.add("Banana");
		fruitNames.add("Cane");
		fruitNames.add("Green Apple");
		
		fruits = fruitNames.elements();
		
		while(fruits.hasMoreElements()){
			System.out.println(fruits.nextElement());
		}
	}
}