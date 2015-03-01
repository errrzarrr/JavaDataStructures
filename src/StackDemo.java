import java.util.*;

public class StackDemo {
	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("push("+ a +")");
		System.out.println("Stack: " + st);
	}
	
	static void showpop(Stack st) {
		Integer a = (Integer) st.pop();
		System.out.println("pop -> " + a );
		
		System.out.println("Stack: " + st);
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println("Stack: " + st);
		
		showpush(st, 2);
		showpush(st, 5);
		showpush(st, 84);
		
		showpop(st);
		showpop(st);
		showpop(st);
		
		try {
			showpop(st);
		}
		catch(EmptyStackException e){
			System.out.println("empty stack - " + e);
		}
	}

}
