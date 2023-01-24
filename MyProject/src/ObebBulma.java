import java.util.Scanner;

public class ObebBulma {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int ebob=1;
		System.out.print("Birinci sayiyi giriniz: ");
		int sayi1 = s.nextInt();
		System.out.print("Ýkinci sayiyi giriniz: ");
		int sayi2 = s.nextInt();
		
		int maxSayi = Math.max(sayi1, sayi2);
		
		for (int i = 1; maxSayi >= i ; i++) {
			if (sayi1 % i == 0 && sayi2 % i == 0) {
				ebob = i;
			}
		}
		
		System.out.println("Girilen sayilarin ebobu: " + ebob);
	}
}
