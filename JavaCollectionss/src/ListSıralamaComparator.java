import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BuyuktenKucuge implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
	}
	
}
class Playerrr  {
	private String isim;

	private int id;

	public Playerrr(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}

	@Override
	public String toString() {
		return "|||| ID: " + id + " �sim :" + isim + " |||";

	}

}
	
public class ListS�ralamaComparator {
	
	public static void main(String[] args) {
			
		List<String> list = new ArrayList<String>();
        
		 list.add("Java");
	     list.add("Python");
	     list.add("C++");
	     list.add("Go");
        
	     Collections.sort(list, new BuyuktenKucuge()); //class'� buraya g�nderiyoruz.
	     
	     System.out.println(list);
		}
	}



