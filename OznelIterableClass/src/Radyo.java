import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String>{ // Kendi iterable classýmýzý da yazabiliriz.

	private ArrayList<String> kanallar_listesi = new ArrayList<>();
	
	public Radyo (String [] kanallar){
		
		for (String s : kanallar) {
			
			kanallar_listesi.add(s);
		}
	}

	@Override
	public Iterator<String> iterator() {
		
		return kanallar_listesi.iterator();
	}
}
