import java.util.Enumeration;
import java.util.Stack;

public class Stackler {

	public static void main(String[] args) {
		// Stackler vectorlerden extends edilirler. 
		// Stacklerde "son giren ilk ��kar" mant��� vard�r.
		
		Stack <String> stack = new Stack <>();
		
		stack.push("Java"); //stack.add ile de eklenebilir
		stack.push("Python");
		stack.push("Php");
		stack.push("Go");
		
		Enumeration <String> enumeration = stack.elements();
		
		
		System.out.println("Son Giren Eleman: " + stack.peek()); // Stack' e son giren eleman� yazd�r�r.
		System.out.println("Son Giren Eleman� ��kart: " + stack.pop()); // Art�k "Go" eleman� stack i�inde bulunmayacak (Stack'e son giren eleman� ��kart�r).
		
		while (enumeration.hasMoreElements()) {
			
			System.out.println(enumeration.nextElement());
		}
		
		System.out.println(stack.empty()); // Stack i�i kontrol yapar. ��i doluysa false d�ner.
		
	}

}
