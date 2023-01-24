import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		/*
	    HashMap Sýnýfý
	    
	    1. Deðerleri Key(Anahtar) ve Value(Deðer) olarak depolar. Her key'e karþýlýk
	    gelen bir tane deðer bulunur.
	    2. Bir anahtar sadece bir kez varolabilir. Ancak bir deðer birden fazla olabilir.
	    3. Elementleri týpký HashSet gibi ekleme sýrasýna göre depolamaz. (HashSet gibi)
	    */

		HashMap<Integer, String> hashM = new HashMap<>();
		
		hashM.put(40, "Java");
		hashM.put(10, "Python");
		hashM.put(20, "C++");
		hashM.put(30, "Javascript");
		
		System.out.println(hashM);
		System.out.println(hashM.get(10)); // O key' e karþýlýk gelen deðeri bastýrýr.
		System.out.println("--------------------------------------------------------");
		
		for (Map.Entry<Integer, String> a: hashM.entrySet()) { // Hashmap sýnýfýnýn for each döngüsünde kullanýmý.
			System.out.println(a);
		}
		
		
	}

}
