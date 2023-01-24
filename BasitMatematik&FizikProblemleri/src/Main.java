import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Matematik ve Fizik Problemleri Program�na Ho�geldiniz...");
		
		String islemler = "1. Daire Alan� Hesaplama\n"
				+ "2. ��gen �evresi Hesaplama\n"
				+ "3. 2 Vekt�r�n �� �arp�m�n� Hesaplama\n"
				+ "��k�� i�in 'q'ya bas�n�z.";
		
		while (true) {
			System.out.println("**********************");
			System.out.println(islemler);
			System.out.println("**********************");
			System.out.print("Bir i�lem se�iniz: ");
			String islem = s.nextLine();
			
			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}
			
			else if (islem.equals("1")) {
				
				System.out.print("Dairenin yar��ap�n� giriniz: ");
				
				int yaricap = s.nextInt();
				s.nextLine(); // Scanner class �ndaki hatay� engellemek i�in kullan�ld�.
				
				Problem.Matematik.daire_alan(yaricap);
			}
			
			else if (islem.equals("2")) {
				
				System.out.print("Kenar 1: ");
				int kenar1 = s.nextInt();
				System.out.print("Kenar 2: ");
				int kenar2 = s.nextInt();
				System.out.print("Kenar 3: ");
				int kenar3 = s.nextInt();
				s.nextLine();
				
				Problem.Matematik.ucgen_cevre(kenar1, kenar2, kenar3);
			}
			
			else if (islem.equals("3")) {
				Vector vekt1 = new Vector("Vekt�r1"); //vekt1 olu�unca i,j ve k de�erleri istenecek.
				Vector vekt2 = new Vector("Vekt�r2");
				
				Problem.Fizik.icCarpim(vekt1, vekt2);
			}
		}

	}

}
