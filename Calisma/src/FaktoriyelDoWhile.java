import java.util.Scanner;

public class FaktoriyelDoWhile {

	public static void main(String[] args) {

		int faktor = 1, sayi, temp;
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayi giriniz: ");

		sayi = scan.nextInt();
		temp = sayi;

		if (sayi == 0) {

			System.out.println(sayi + " say�s�n�n faktoriyel de�eri: " + 1);
		} else {
			
			do {

				if (sayi == 0) {

				}
				faktor *= sayi;
				sayi--;

			} while (sayi > 1);

			System.out.println(temp + " say�s�n�n faktoriyel de�eri: " + faktor);

		}
	}

}
