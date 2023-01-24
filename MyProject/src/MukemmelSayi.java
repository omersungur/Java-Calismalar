import java.util.Scanner;

public class MukemmelSayi {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir sayi giriniz: ");
		int sayi = scan.nextInt();
		int bolen = 1, toplam = 0;
		
		while (bolen < sayi) {
			if (sayi % bolen == 0) {
				toplam += bolen; // toplam = toplam + bolen
			}
			
			bolen++;
			
		}
		
		if (toplam == sayi) {
			System.out.println(sayi + " sayisi mükemmel sayidir");
		}
		
		else {
			System.out.println(sayi + " sayisi mükemmel sayi deðildir.");
		}
		
	}

}
