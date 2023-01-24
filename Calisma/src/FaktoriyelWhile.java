import java.util.Scanner;

public class FaktoriyelWhile {

	public static void main(String[] args) {
		
		int faktor = 1, sayi,temp;
		Scanner yaprak = new Scanner (System.in);
		
		System.out.println("Bir sayi giriniz: ");
		
		sayi = yaprak.nextInt();
		temp = sayi;
		
		while (sayi > 0) {
			faktor *= sayi;
			sayi--;
		}
		
		System.out.println(temp + " sayýsýnýn faktoriyel deðeri: " + faktor);
		

	}

}
