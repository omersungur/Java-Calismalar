import java.util.Scanner;

public class NotHesaplamaIfElse {

	public static void main(String[] args) {

		byte vizeNot, finalNot, ortalama;
		Scanner scan = new Scanner(System.in);

		System.out.print("Vize notunuzu giriniz: ");
		vizeNot = scan.nextByte();

		System.out.print("Final notunuzu giriniz: ");
		finalNot = scan.nextByte();

		ortalama = (byte) (vizeNot * 0.4 + finalNot * 0.6);

		if (ortalama > 90) {
			System.out.println("Tebrikler yaprak bey AA ile geçtiniz.");
		}

		else if (ortalama > 80) {
			System.out.println("Tebrikler yaprak bey BB ile geçtiniz.");
		}

		else if (ortalama > 70) {
			System.out.println("Tebrikler yaprak bey CB ile geçtiniz.");
		}

		else if (ortalama > 60) {
			System.out.println("Tebrikler yaprak bey CC ile geçtiniz.");
		}

		else {
			System.out.println("Kaldýn yaprak... :) " + "ortalaman: " + ortalama);
		}

	}
}
