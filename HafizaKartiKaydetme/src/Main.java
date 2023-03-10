import java.io.File;
import java.util.Scanner;

public class Main {

	private static Kart[][] kartlar = new Kart[4][4];

	public static void kay?ttanAll () {
		File file = new File("kayit.bin");
		Scanner scan = new Scanner(System.in);
		
		if (file.exists()) {
			System.out.println("Kaydedilmi? bir oynunuz var. Kald???n?z yerden devam etmek ister misiniz? (yes or no): ");
			String cevap = scan.nextLine();
			
			if (cevap.equals("yes")) {
				kartlar = OyunKayit.kay?ttanAl();
				return;
			}
		}
		
		kartlar[0][0] = new Kart('E');
		kartlar[0][1] = new Kart('A');
		kartlar[0][2] = new Kart('B');
		kartlar[0][3] = new Kart('F');
		kartlar[1][0] = new Kart('G');
		kartlar[1][1] = new Kart('A');
		kartlar[1][2] = new Kart('D');
		kartlar[1][3] = new Kart('H');
		kartlar[2][0] = new Kart('F');
		kartlar[2][1] = new Kart('C');
		kartlar[2][2] = new Kart('D');
		kartlar[2][3] = new Kart('H');
		kartlar[3][0] = new Kart('E');
		kartlar[3][1] = new Kart('G');
		kartlar[3][2] = new Kart('B');
		kartlar[3][3] = new Kart('C');
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		kay?ttanAll();
		
		

		while (oyunBittiMi() == false) {
			oyunTahtasi();
			
			System.out.print("??k?? i?in 'q'ya bas?n?z (yes or no): ");
			String cikis = scan.nextLine();
			
			if (cikis.equals("yes")) {
				System.out.print("Oyunu kaydetmek istiyor musunuz? (yes or no): ");
				
				String kayit = scan.nextLine();
				
				if (kayit.equals("yes")) {
					
					OyunKayit.oyunKaydet(kartlar);
				}
				
				else {
					System.out.println("Oyun kaydedilmedi...");
				}
				
				System.out.println("Programdan ??k?l?yor...");
				break;
			}
			
			tahminEt();
		}

	}

	public static void tahminEt() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Birinci tahmin (i ve j de?erlerini bir bo?luklu giriniz): ");
		int i1 = scan.nextInt();
		int j1 = scan.nextInt();

		kartlar[i1][j1].setTahmin(true);
		oyunTahtasi();

		System.out.print("?kinci tahmin (i ve j de?erlerini bir bo?luklu giriniz): ");
		int i2 = scan.nextInt();
		int j2 = scan.nextInt();

		if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
			System.out.println("Do?ru Tahmin.");
			kartlar[i2][j2].setTahmin(true);
		}

		else {
			System.out.println("Yanl?? Tahmin");
			kartlar[i1][j1].setTahmin(false);
		}

	}

	public static boolean oyunBittiMi() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (kartlar[i][j].isTahmin() == false) {
					return false;
				}
			}
		}
		return true;
	}

	public static void oyunTahtasi() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				if (kartlar[i][j].isTahmin()) {
					System.out.print(" |" + kartlar[i][j].getDeger() + "| ");
				}

				else {
					System.out.print(" | | ");
				}

			}
			System.out.println();
		}

	}
}
