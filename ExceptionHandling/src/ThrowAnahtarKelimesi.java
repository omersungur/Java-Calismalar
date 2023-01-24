import java.util.Scanner;

public class ThrowAnahtarKelimesi {

	public static void mekanKontrol (int yas) {
		
		if (yas < 18) {
			throw new ArithmeticException ("ss"); // Hatay� kendimiz f�rlatt�k (Unchecked Exception oldu�u i�in throws kullanmad�k).
		}										  // Parantez i�inede String tipinde veri yaz�labilir toString metodu ile yazd�rabiliriz.
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
		}
		
		catch (ArithmeticException e) { // ArithmeticException veya Exception olmal�.
			
			System.out.println("18 ya��ndan k���kler giremez..");
			System.out.println(e.toString()); // throw ile f�rlatt���m�z hata ve hatan�n mesaj k�sm�.
		}
	}
}
