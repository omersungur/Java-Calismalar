
public class Main {

	public static void main(String[] args) {
		
		String [] kanallar = {"Kral FM", "Kral Pop", "Alem FM", "Radyo Viva"};
		
		Radyo radyo = new Radyo(kanallar);
		
		// for (String s: radyo) > Bu yap�y� kullanabilmek i�in, kullan�lacak class'a iterable s�n�f�n�n dahil olmas� gerekli.
			
		for (String s: radyo) { // Iterable implement ettikten sonra kullanabiliyoruz.
			System.out.println(s);
		}

	}

}
