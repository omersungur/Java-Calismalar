import java.util.Scanner;

public class ss {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen bir tam say� de�eri giriniz:");
		int sayi = input.nextInt();
		for (int i = 1; i <= sayi; i++) {
			for (int j = sayi; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
