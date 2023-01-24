import java.util.Scanner;

public class dsadsads {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Alt Deðer Giriniz: ");
		int altDeger = scan.nextInt();
		System.out.print("Üst Deðer Giriniz: ");
		int ustDeger = scan.nextInt();

		for (int sayi = altDeger; sayi <= ustDeger; sayi++) {

			int temp = 0;

			for (int bolen = 2; bolen <= sayi; bolen++) {

				if (sayi % bolen == 0) {
					temp++;
				}
			}

			if (temp == 1) {
				System.out.println(sayi);
			}
		}

	}

}
