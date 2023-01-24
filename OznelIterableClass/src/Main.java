
public class Main {

	public static void main(String[] args) {
		
		String [] kanallar = {"Kral FM", "Kral Pop", "Alem FM", "Radyo Viva"};
		
		Radyo radyo = new Radyo(kanallar);
		
		// for (String s: radyo) > Bu yapýyý kullanabilmek için, kullanýlacak class'a iterable sýnýfýnýn dahil olmasý gerekli.
			
		for (String s: radyo) { // Iterable implement ettikten sonra kullanabiliyoruz.
			System.out.println(s);
		}

	}

}
