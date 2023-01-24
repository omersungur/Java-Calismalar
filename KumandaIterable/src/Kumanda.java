import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String>{

	private ArrayList<String> kanallar = new ArrayList<>();
	
	public class kumandaIterator implements Iterator<String> {
		public int index = 0;
		@Override
		public boolean hasNext() {
			
			if(index >= kanallar.size()) {
				return false;
			}
			
			else {
				return true;
			}
		}

		@Override
		public String next() {
			
			String kanal = kanallar.get(index);
			index++;
			return kanal;
		}
		
	}
	public void kanalEkle (String kanal_ismi) {
		kanallar.add(kanal_ismi);
	}
	
	public void kanalSil (String kanal_ismi) {
		if(kanallar.contains(kanal_ismi)) {
			kanallar.remove(kanal_ismi);
		}
		else {
			System.out.println("Böyle bir kanal bulunmuyor...");
		}
	}
	
	public int kanalSayisi (){
		
		return kanallar.size();
	}

	@Override
	public Iterator<String> iterator() {
		
		return new kumandaIterator();
	}
}
