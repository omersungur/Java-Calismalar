import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Programa Ho�geldiniz...");
		String islemler = "1.Kare Alan� Hesapla \n"
				+ "2.Daire Alan� Hesapla \n"
				+ "3.��gen Alan� Hesapla\n"
				+ "��k�� i�in 'q' ya bas�n�z.";
		
		while (true) {
			System.out.println("-------------------------------");
			System.out.println(islemler);
			Sekil sekil = null;
				
				
			System.out.print("Bir i�lem se�iniz: ");
			String islem = s.nextLine();
			
			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}
			else if (islem.equals("1")) {
				System.out.print("Kare'nin kenar�n� giriniz: ");
				int karekenar = s.nextInt();
				s.nextLine();
				sekil = new Kare("kare", karekenar); //Polymorphism
				sekil.alan_hesapla();
			}
			
			else if (islem.equals("2")) {
				System.out.print("Dairenin yar��ap�n� giriniz: ");
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
				sekil = new Ucgen("��gen", kenar1, kenar2, kenar3);
				sekil.alan_hesapla();
			}
			
			else {
				System.out.println("Ge�ersiz i�lem...");
			}
		}
	}
}
