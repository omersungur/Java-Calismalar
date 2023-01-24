import java.util.Scanner;

public class asdads {

	public static void main(String[] args) {
		
		int faktor =1;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Bir sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		while (sayi > 1) {
			faktor *= sayi;
			sayi--;
		}
		
		System.out.println(faktor);

	}

}
