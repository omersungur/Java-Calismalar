import java.util.Scanner;

public class FaktoriyelFor {

	public static void main(String[] args) {
		
		int faktor = 1, sayi,temp;
		Scanner ibo = new Scanner (System.in);
		
		System.out.println("Bir sayi giriniz: ");
		
		sayi = ibo.nextInt();
		temp = sayi;
		
		for (; sayi > 0; sayi--) {
			
			faktor *= sayi;
		}
		
		System.out.println(temp + " sayýsýnýn faktoriyel deðeri: " + faktor);

	}

}
