import java.util.Scanner;

public class EkokBulma {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int ekok=88445;
		System.out.print("Birinci sayiyi giriniz: ");
		int sayi1 = s.nextInt();
		System.out.print("Ýkinci sayiyi giriniz: ");
		int sayi2 = s.nextInt();
		int minSayi = Math.min(sayi1, sayi2);
		
		while (minSayi <= sayi1*sayi2) {
			if (minSayi % sayi1 == 0 && minSayi % sayi2 == 0) {
				ekok = minSayi;
				break;
			}
			
			minSayi++;
		}
		
		System.out.println("Girilen sayilarýn ekoku: " + ekok);
		
		s.close();
		
		
	}

}
