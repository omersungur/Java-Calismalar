import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorler {

	public static void main(String[] args) {
		
		Vector <String> vector = new Vector<>();
		
		vector.add("�mer");
		vector.add("Hasan");
		vector.add("Hasan");
		vector.add("Ali");
		
		/*ListIterator<String> iterator = vector.listIterator(); >> �terator ile yazd�rma
		
		while (iterator.hasNext()) {
			
			//System.out.println(iterator.next());
		}*/

		Enumeration<String> enumeration = vector.elements(); // Enumeration yap�s� ile yazd�rma
		
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		System.out.println("�lk eleman: " + vector.firstElement());
		System.out.println("Son eleman: " + vector.lastElement());
	}

}
