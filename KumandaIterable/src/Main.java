import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kumanda Programýna Hoþgeldiniz...");
		
		Scanner s = new Scanner (System.in);
		
		String islemler = "Ýþlemler...\n"
				+ "1. Kanallarý Göster\n"
				+ "2. Kanal Ekle\n"
				+ "3. Kanal Sil\n"
				+ "4. Kanal Sayýsý Öðren\n"
				+ "Çýkýþ için 'q' ya basýnýz.";
		
		Kumanda kumanda = new Kumanda();
		while (true) {
			System.out.println(islemler);
			System.out.println("***********************");
			System.out.print("Ýþlemi giriniz: ");
			String islem = s.nextLine();
			
			if (islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor...");
				break;
			}
			
			else if (islem.equals("1")) {
				kanallariGoster(kumanda);
			}
			else if (islem.equals("2")) {
				System.out.print("Eklenecek kanal ismi: ");
				String kanal_ismi = s.nextLine();
				kumanda.kanalEkle(kanal_ismi);
			}
			else if (islem.equals("3")) {
				System.out.print("Silinecek kanal ismi: ");
				String kanal_ismi = s.nextLine();
				kumanda.kanalSil(kanal_ismi);
				
	
			}
			else if (islem.equals("4")) {
	
				System.out.println("Kanal Sayýsý: " + kumanda.kanalSayisi());
			}
			else {
				System.out.println("Geçersiz iþlem...");
			}
			
		}
	}
	
	public static void kanallariGoster (Kumanda kumanda) {
		
		if (kumanda.kanalSayisi() == 0) {
			System.out.println("Þu an da hiç bir kanal bulunmuyor...");
		}
		
		else {
			for (String s: kumanda) {
				System.out.println("Kanal: " + s);
			}
		}
	}
}
