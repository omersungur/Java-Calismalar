package GenericMethodlar;

public class Test {

	public static void main(String[] args) {
		
		Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
		Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);
		
		Sayisal birinci = birinciHesapla(sayisal1, sayisal2);
		
		System.out.println("1.Say�sal ��rencinin Puan�: " + birinci.puanHesapla());
		
		EsitAgirlik esit1 = new EsitAgirlik(25, 30, 30, 15);
		EsitAgirlik esit2 = new EsitAgirlik(25, 30, 45, 5);
		
		EsitAgirlik birinci2 = birinciHesapla(esit1, esit2);
		System.out.println("1.S�zel ��rencinin Puan�: " + birinci2.puanHesapla());
		
		
		
		
		}
	
	public static <E extends AdayOgrenci> E birinciHesapla (E o1, E o2) { //Generic yaz�lmasayd� ayr� ayr� 2 method tan�mlamak zorundayd�k.
		
		if (o1.puanHesapla() > o2.puanHesapla()) {
			return o1;
		}
		
		else {
			return o2;
		}
	}
	
	// E extends AdayOgrenci ifadesi sadece AdayOgrenci class�ndan de�i�ken g�nderilebilir anlam�na gelir. Burada yaz�lmazsa hata verir.

}
