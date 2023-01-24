import java.util.Scanner;

public class ArmstrongSayisi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayi giriniz: ");

		int sayi = scan.nextInt();
		int toplam = 0;
		int sayii = sayi;
		int rakam;

		while (sayi > 0) {
			rakam = sayi % 10;
			toplam += (int) Math.pow(rakam, 3);
			sayi /= 10; // sayi = sayi / 10

		}

		if (toplam == sayii) {
			System.out.println("Girilen sayi armstrong sayisidir.");
		}

		else {
			System.out.println("Girilen sayi armstrong sayisi deðildir.");
		}
	}
}
