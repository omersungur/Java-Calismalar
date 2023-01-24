import java.util.Scanner;

public class ThrowAnahtarKelimesi {

	public static void mekanKontrol (int yas) {
		
		if (yas < 18) {
			throw new ArithmeticException ("ss"); // Hatayý kendimiz fýrlattýk (Unchecked Exception olduðu için throws kullanmadýk).
		}										  // Parantez içinede String tipinde veri yazýlabilir toString metodu ile yazdýrabiliriz.
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
		}
		
		catch (ArithmeticException e) { // ArithmeticException veya Exception olmalý.
			
			System.out.println("18 yaþýndan küçükler giremez..");
			System.out.println(e.toString()); // throw ile fýrlattýðýmýz hata ve hatanýn mesaj kýsmý.
		}
	}
}
