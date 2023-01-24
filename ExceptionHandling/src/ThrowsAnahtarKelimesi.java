import java.io.IOException;
import java.util.Scanner;

public class ThrowsAnahtarKelimesi {

	//throws anahtar kelimesiyle hata kontrol�n� bu metodu �a��ran metoda devretmi� oluyoruz.
	//throws bir �e�it metod i�aretleme anahtar kelimesidir.
	
	public static void mekanKontrol (int yas) throws IOException { //Checked Exception t�r� > IOException (Checked exception oldu�u zaman zorunlu)
		
	// public static void mekanKontrol (int yas) throws IOException, ArithmeticException... Birden fazla hata tipi yaz�labilir.
		
		if (yas < 18) {
			throw new IOException(); // Hatay� kendimiz f�rlatt�k
		}
		else {
			System.out.println("Mekana ho�geldiniz...");
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Ya��n�z� giriniz: ");
		int yas = scan.nextInt();
		
		try {
			mekanKontrol(yas);
		} catch (IOException e) {
			
			System.out.println("IOException hatas� olu�tu...");
		}

	}

}
