import java.util.Vector;
import java.util.Enumeration;

public class TheVector {
	public static void main(String[] args) {
	Vector v = new Vector(3, 2);
	
	System.out.println("Initial size: " + v.size());
	System.out.println("Initial capacity" + v.capacity());
	
	v.addElement(new Integer(1));
	v.addElement(new Integer(2));
	v.addElement(new Integer(3));
	v.addElement(new Integer(4));
	System.out.println
	("Capacity after four additions: " + v.capacity());
	
	v.addElement(new Double(5.45));
	System.out.println("Current capacity: " +v.capacity());
	v.addElement(new Double(1.10));
	v.addElement(new Integer(7));
	System.out.println("Current capacity: " +v.capacity());
	v.addElement(new Float(9.4));
	System.out.println("Current capacity: " +v.capacity());
	
	System.out.println();
	System.out.println("First Element: " + (Integer) v.firstElement());
	System.out.println("Last Element: " + (Float) v.lastElement());
	
	if( v.contains(new Integer(3)) )
		System.out.println("Vector contains 3");
	
	// Enumerate the elements in the vector
	
	Enumeration vEnum = v.elements();
	
	System.out.println("\n" + "Elements in vector:");
	
	while( vEnum.hasMoreElements() )
		System.out.print( vEnum.nextElement() + " - ");
	}
}
