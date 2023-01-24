import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		/*
	    HashMap S�n�f�
	    
	    1. De�erleri Key(Anahtar) ve Value(De�er) olarak depolar. Her key'e kar��l�k
	    gelen bir tane de�er bulunur.
	    2. Bir anahtar sadece bir kez varolabilir. Ancak bir de�er birden fazla olabilir.
	    3. Elementleri t�pk� HashSet gibi ekleme s�ras�na g�re depolamaz. (HashSet gibi)
	    */

		HashMap<Integer, String> hashM = new HashMap<>();
		
		hashM.put(40, "Java");
		hashM.put(10, "Python");
		hashM.put(20, "C++");
		hashM.put(30, "Javascript");
		
		System.out.println(hashM);
		System.out.println(hashM.get(10)); // O key' e kar��l�k gelen de�eri bast�r�r.
		System.out.println("--------------------------------------------------------");
		
		for (Map.Entry<Integer, String> a: hashM.entrySet()) { // Hashmap s�n�f�n�n for each d�ng�s�nde kullan�m�.
			System.out.println(a);
		}
		
		
	}

}
