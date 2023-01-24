import java.util.Scanner;

public class FaktoriyelMethods {

	static int faktor = 1;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bir sayi giriniz: ");
		int sayi = scan.nextInt();

		System.out.println(faktorHesap(sayi));
		
		scan.close();

	}

	public static int faktorHesap(int sayi) {

		for (; 1 < sayi; sayi--) {
			faktor *= sayi;
		}

		return faktor;
	}

}
