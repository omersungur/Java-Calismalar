import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Matematik ve Fizik Problemleri Programýna Hoþgeldiniz...");
		
		String islemler = "1. Daire Alaný Hesaplama\n"
				+ "2. Üçgen Çevresi Hesaplama\n"
				+ "3. 2 Vektörün Ýç Çarpýmýný Hesaplama\n"
				+ "Çýkýþ için 'q'ya basýnýz.";
		
		while (true) {
			System.out.println("**********************");
			System.out.println(islemler);
			System.out.println("**********************");
			System.out.print("Bir iþlem seçiniz: ");
			String islem = s.nextLine();
			
			if (islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor...");
				break;
			}
			
			else if (islem.equals("1")) {
				
				System.out.print("Dairenin yarýçapýný giriniz: ");
				
				int yaricap = s.nextInt();
				s.nextLine(); // Scanner class ýndaki hatayý engellemek için kullanýldý.
				
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
				Vector vekt1 = new Vector("Vektör1"); //vekt1 oluþunca i,j ve k deðerleri istenecek.
				Vector vekt2 = new Vector("Vektör2");
				
				Problem.Fizik.icCarpim(vekt1, vekt2);
			}
		}

	}

}
