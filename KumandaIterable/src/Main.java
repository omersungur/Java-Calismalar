import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kumanda Program�na Ho�geldiniz...");
		
		Scanner s = new Scanner (System.in);
		
		String islemler = "��lemler...\n"
				+ "1. Kanallar� G�ster\n"
				+ "2. Kanal Ekle\n"
				+ "3. Kanal Sil\n"
				+ "4. Kanal Say�s� ��ren\n"
				+ "��k�� i�in 'q' ya bas�n�z.";
		
		Kumanda kumanda = new Kumanda();
		while (true) {
			System.out.println(islemler);
			System.out.println("***********************");
			System.out.print("��lemi giriniz: ");
			String islem = s.nextLine();
			
			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
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
	
				System.out.println("Kanal Say�s�: " + kumanda.kanalSayisi());
			}
			else {
				System.out.println("Ge�ersiz i�lem...");
			}
			
		}
	}
	
	public static void kanallariGoster (Kumanda kumanda) {
		
		if (kumanda.kanalSayisi() == 0) {
			System.out.println("�u an da hi� bir kanal bulunmuyor...");
		}
		
		else {
			for (String s: kumanda) {
				System.out.println("Kanal: " + s);
			}
		}
	}
}
