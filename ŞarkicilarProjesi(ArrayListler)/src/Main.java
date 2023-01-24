import java.util.Scanner;

public class Main {

	private static Sarkicilar sarkicilar = new Sarkicilar();
	private static Scanner scan = new Scanner(System.in);
	public static void islemleri_bastir () {
		System.out.println("\t 0-��lemleri G�r�nt�le");
		System.out.println("\t 1-�ark�c�lar� G�r�nt�le");
		System.out.println("\t 2-�ark�c� Ekle");
		System.out.println("\t 3-�ark�c� G�ncelle");
		System.out.println("\t 4-�ark�c� Sil");
		System.out.println("\t 5-�ark�c� Ara");
		System.out.println("\t 6-Uygulamadan ��k");
	}

	public static void main(String[] args) {

		System.out.println("\t �ark�c�lar Uygulamas�na Ho�geldiniz...");
		islemleri_bastir();
		
		boolean cikis = false;
		int islem;
		
		while (!cikis) {
			System.out.println("��lem Se�iniz: ");
			islem = scan.nextInt();
			scan.nextLine();
			
			switch (islem) {
				case 0: 
					islemleri_bastir();
					break;
				case 1:
					goruntule();
					break;
				case 2:
					sarkici_ekle ();
					break;
				case 3:
					sarkici_guncelle();
					break;
				case 4:
					sil();
					break;
				case 5:
					ara();
					break;
				case 6:
					cikis = true;
					System.out.println("Uygulamadan ��k�l�yor...");
					break;
			}
			
			
		}
	}

	private static void sarkici_guncelle() {
		
		System.out.println("G�ncellemek istedi�iniz �ark�c�n�n pozisyonu: ");
		int pozisyon = scan.nextInt();
		scan.nextLine();
		System.out.println("G�ncellemek istedi�iniz �ark�c� ismi: ");
		String yeni_isim = scan.nextLine();
		sarkicilar.sarkici_guncelle(yeni_isim, pozisyon-1);
		
	}

	private static void ara() {
		
		System.out.println("Aramak istedi�iniz �ark�c� ismini giriniz: ");
		String sarkici_ismi1 = scan.nextLine();
		sarkicilar.sarkici_ara(sarkici_ismi1);
		
	}

	private static void sil() {
		
		System.out.println("Silmek istedi�iniz sarkicinin numaras�n� giriniz: ");
		int pozisyon = scan.nextInt();
		sarkicilar.sarkici_sil(pozisyon-1);
		
		
	}

	private static void sarkici_ekle() {
		System.out.println("Eklemek istedi�iniz �ark�c�n�n ismini giriniz: ");
		String yeni_sarkici1 = scan.nextLine();
		sarkicilar.sarkici_ekle(yeni_sarkici1);
	}

	private static void goruntule() {
		
		sarkicilar.sarkicilari_bastir();
	}

}
