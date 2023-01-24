import java.util.Scanner;

public class Main {

	private static Sarkicilar sarkicilar = new Sarkicilar();
	private static Scanner scan = new Scanner(System.in);
	public static void islemleri_bastir () {
		System.out.println("\t 0-Ýþlemleri Görüntüle");
		System.out.println("\t 1-Þarkýcýlarý Görüntüle");
		System.out.println("\t 2-Þarkýcý Ekle");
		System.out.println("\t 3-Þarkýcý Güncelle");
		System.out.println("\t 4-Þarkýcý Sil");
		System.out.println("\t 5-Þarkýcý Ara");
		System.out.println("\t 6-Uygulamadan Çýk");
	}

	public static void main(String[] args) {

		System.out.println("\t Þarkýcýlar Uygulamasýna Hoþgeldiniz...");
		islemleri_bastir();
		
		boolean cikis = false;
		int islem;
		
		while (!cikis) {
			System.out.println("Ýþlem Seçiniz: ");
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
					System.out.println("Uygulamadan çýkýlýyor...");
					break;
			}
			
			
		}
	}

	private static void sarkici_guncelle() {
		
		System.out.println("Güncellemek istediðiniz þarkýcýnýn pozisyonu: ");
		int pozisyon = scan.nextInt();
		scan.nextLine();
		System.out.println("Güncellemek istediðiniz þarkýcý ismi: ");
		String yeni_isim = scan.nextLine();
		sarkicilar.sarkici_guncelle(yeni_isim, pozisyon-1);
		
	}

	private static void ara() {
		
		System.out.println("Aramak istediðiniz þarkýcý ismini giriniz: ");
		String sarkici_ismi1 = scan.nextLine();
		sarkicilar.sarkici_ara(sarkici_ismi1);
		
	}

	private static void sil() {
		
		System.out.println("Silmek istediðiniz sarkicinin numarasýný giriniz: ");
		int pozisyon = scan.nextInt();
		sarkicilar.sarkici_sil(pozisyon-1);
		
		
	}

	private static void sarkici_ekle() {
		System.out.println("Eklemek istediðiniz þarkýcýnýn ismini giriniz: ");
		String yeni_sarkici1 = scan.nextLine();
		sarkicilar.sarkici_ekle(yeni_sarkici1);
	}

	private static void goruntule() {
		
		sarkicilar.sarkicilari_bastir();
	}

}
