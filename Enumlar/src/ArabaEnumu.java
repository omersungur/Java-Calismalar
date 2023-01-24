enum Arabalar { // ba��na public de gelebilir.

	AUDI(200), BMW(190), OPEL(180), FIAT(160);

	public int hiz; // Ald��� de�eri enum i�indeki de�erlere at�yor.

	Arabalar(int hiz) { // Constructor enumla ayn� isimde olmal� ve public olamaz.Ald��� de�erleri enumun i�indeki h�z de�erlerine atar.
		                // Enumlar miras alamazlar.
		this.hiz = hiz;
	}
}

public class ArabaEnumu {

	public static void main(String[] args) {

		System.out.println(Arabalar.AUDI.hiz); // AUDI'nin h�z�na ula�t�k.
		System.out.println("----------------------------");

		for (Arabalar a : Arabalar.values()) { // Arabalar.values() ifadesiyle enumdaki elemanlar� kastediyoruz.
			System.out.print(a.name() + "- "); // a referans�yla name ifadesiyle enumun isimlerine ula�abildik.
			System.out.println(a.hiz);
		}

		System.out.println("-----------------------------");

		System.out.println(Arabalar.AUDI.ordinal()); // AUDI eleman�n�n ka��nc� indiste oldu�unu ��reniyoruz.(Enumlarda diziler gibidir)
														

	}

}
