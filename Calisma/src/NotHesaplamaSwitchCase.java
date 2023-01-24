import java.util.Scanner;

public class NotHesaplamaSwitchCase {

	public static void main(String[] args) {

		byte vizeNot, finalNot, ortalama, number;
		Scanner scan = new Scanner(System.in);

		System.out.print("Vize notunuzu giriniz: ");
		vizeNot = scan.nextByte();

		System.out.print("Final notunuzu giriniz: ");
		finalNot = scan.nextByte();

		ortalama = (byte) (vizeNot * 0.4 + finalNot * 0.6);

		if (ortalama > 90) {
			number = 1;
		}

		else if (ortalama > 80) {
			number = 2;
		}

		else if (ortalama > 70) {
			number = 3;
		}

		else if (ortalama > 60) {
			number = 4;
		}

		else {
			number = 5;
		}

		switch (number) {
		case 1:
			System.out.println("AA");
			break;
		case 2:
			System.out.println("BB");
			break;
		case 3:
			System.out.println("CB");
			break;
		case 4:
			System.out.println("CC");
			break;
		default:
			System.out.println("Kaldýnnn");
		}

	}

}
