import java.io.IOException;
import java.util.Scanner;

public class ThrowsAnahtarKelimesi {

	//throws anahtar kelimesiyle hata kontrolünü bu metodu çaðýran metoda devretmiþ oluyoruz.
	//throws bir çeþit metod iþaretleme anahtar kelimesidir.
	
	public static void mekanKontrol (int yas) throws IOException { //Checked Exception türü > IOException (Checked exception olduðu zaman zorunlu)
		
	// public static void mekanKontrol (int yas) throws IOException, ArithmeticException... Birden fazla hata tipi yazýlabilir.
		
		if (yas < 18) {
			throw new IOException(); // Hatayý kendimiz fýrlattýk
		}
		else {
			System.out.println("Mekana hoþgeldiniz...");
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Yaþýnýzý giriniz: ");
		int yas = scan.nextInt();
		
		try {
			mekanKontrol(yas);
		} catch (IOException e) {
			
			System.out.println("IOException hatasý oluþtu...");
		}

	}

}
