import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Programa Hoþgeldiniz...");
		String islemler = "1.Kare Alaný Hesapla \n"
				+ "2.Daire Alaný Hesapla \n"
				+ "3.Üçgen Alaný Hesapla\n"
				+ "Çýkýþ için 'q' ya basýnýz.";
		
		while (true) {
			System.out.println("-------------------------------");
			System.out.println(islemler);
			Sekil sekil = null;
				
				
			System.out.print("Bir iþlem seçiniz: ");
			String islem = s.nextLine();
			
			if (islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor...");
				break;
			}
			else if (islem.equals("1")) {
				System.out.print("Kare'nin kenarýný giriniz: ");
				int karekenar = s.nextInt();
				s.nextLine();
				sekil = new Kare("kare", karekenar); //Polymorphism
				sekil.alan_hesapla();
			}
			
			else if (islem.equals("2")) {
				System.out.print("Dairenin yarýçapýný giriniz: ");
				int yaricap = s.nextInt();
				s.nextLine();
				sekil = new Daire("daire", yaricap);
				sekil.alan_hesapla();
						
			}
			
			else if (islem.equals("3")) {
				System.out.print("Kenar1: ");
				int kenar1 = s.nextInt();
				System.out.print("Kenar2: ");
				int kenar2 = s.nextInt();
				System.out.print("Kenar3: ");
				int kenar3 = s.nextInt();
				s.nextLine();
				sekil = new Ucgen("Üçgen", kenar1, kenar2, kenar3);
				sekil.alan_hesapla();
			}
			
			else {
				System.out.println("Geçersiz iþlem...");
			}
		}
	}
}
