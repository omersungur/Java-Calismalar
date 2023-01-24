enum Arabalar { // baþýna public de gelebilir.

	AUDI(200), BMW(190), OPEL(180), FIAT(160);

	public int hiz; // Aldýðý deðeri enum içindeki deðerlere atýyor.

	Arabalar(int hiz) { // Constructor enumla ayný isimde olmalý ve public olamaz.Aldýðý deðerleri enumun içindeki hýz deðerlerine atar.
		                // Enumlar miras alamazlar.
		this.hiz = hiz;
	}
}

public class ArabaEnumu {

	public static void main(String[] args) {

		System.out.println(Arabalar.AUDI.hiz); // AUDI'nin hýzýna ulaþtýk.
		System.out.println("----------------------------");

		for (Arabalar a : Arabalar.values()) { // Arabalar.values() ifadesiyle enumdaki elemanlarý kastediyoruz.
			System.out.print(a.name() + "- "); // a referansýyla name ifadesiyle enumun isimlerine ulaþabildik.
			System.out.println(a.hiz);
		}

		System.out.println("-----------------------------");

		System.out.println(Arabalar.AUDI.ordinal()); // AUDI elemanýnýn kaçýncý indiste olduðunu öðreniyoruz.(Enumlarda diziler gibidir)
														

	}

}
