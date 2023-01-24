import java.util.Scanner;

public class FaktoriyelMethods2 {

	static int faktor = 1;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bir sayi giriniz: ");
		int sayi = scan.nextInt();

		faktorHesap(sayi);
		
		scan.close();

	}

	public static void faktorHesap(int sayii) {

		for (; 1 < sayii; sayii--) {
			faktor *= sayii;
		}

		System.out.println(faktor);
	}
	
}

