import java.util.Scanner;

public class AsalSayiBulma {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi = s.nextInt();
		int temp = 0;

		for (int bolen = 2; bolen <= sayi; bolen++) {
			if (sayi % bolen == 0) {
				temp++;
			}
		}

		if (sayi == 1) {
			System.out.println(sayi + " sayisi asal deðildir.");
		}

		else if (temp > 1) {
			System.out.println(sayi + " sayisi asal deðildir.");
		} else {
			System.out.println(sayi + " sayisi asal bir sayidir.");
		}

	}

}
