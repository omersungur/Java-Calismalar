import java.util.Scanner;

public class KelimeyiTerstenYazdýrma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bir kelime giriniz: ");

		String kelime = scan.nextLine();
		int i = kelime.length() - 1;

		for (; i >= 0; i--) {

			System.out.print(kelime.charAt(i));

		}

	}

}
