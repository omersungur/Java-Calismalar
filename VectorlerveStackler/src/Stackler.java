import java.util.Enumeration;
import java.util.Stack;

public class Stackler {

	public static void main(String[] args) {
		// Stackler vectorlerden extends edilirler. 
		// Stacklerde "son giren ilk çýkar" mantýðý vardýr.
		
		Stack <String> stack = new Stack <>();
		
		stack.push("Java"); //stack.add ile de eklenebilir
		stack.push("Python");
		stack.push("Php");
		stack.push("Go");
		
		Enumeration <String> enumeration = stack.elements();
		
		
		System.out.println("Son Giren Eleman: " + stack.peek()); // Stack' e son giren elemaný yazdýrýr.
		System.out.println("Son Giren Elemaný Çýkart: " + stack.pop()); // Artýk "Go" elemaný stack içinde bulunmayacak (Stack'e son giren elemaný çýkartýr).
		
		while (enumeration.hasMoreElements()) {
			
			System.out.println(enumeration.nextElement());
		}
		
		System.out.println(stack.empty()); // Stack içi kontrol yapar. Ýçi doluysa false döner.
		
	}

}
