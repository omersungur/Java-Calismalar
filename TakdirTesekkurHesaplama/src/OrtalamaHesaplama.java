import java.util.Scanner;

public class OrtalamaHesaplama {
	
	public void calis (Hesap hesap) {
		Login login = new Login();
		
		Scanner scan = new Scanner (System.in);
		
		while (true)  {
			if (login.loginn(hesap)) {
				System.out.println("Giri� ba�ar�l�...");
				break;
			}
			else {
				System.out.println("Giri� ba�ar�s�z...");
				return;
			}
		}
		
		int matOrt, fenOrt, sosyalOrt, ingilizceOrt, turkceOrt, a��rl�kl�Not;
		int matSaat, fenSaat, sosyalSaat, ingilizceSaat, turkceSaat, toplamSaat;
		
		System.out.print("Haftal�k Matematik Dersi Saatini Giriniz: ");
		matSaat = scan.nextInt();
		System.out.print("Matematik Ortalaman�z� giriniz: ");
		matOrt = scan.nextInt();
		System.out.print("Haftal�k Fen Dersi Saatini Giriniz: ");
		fenSaat = scan.nextInt();
		System.out.print("Fen Ortalaman�z� giriniz: ");
		fenOrt = scan.nextInt();
		System.out.print("Haftal�k Sosyal Dersi Saatini Giriniz: ");
		sosyalSaat = scan.nextInt();
		System.out.print("Sosyal Ortalaman�z� giriniz: ");
		sosyalOrt = scan.nextInt();
		System.out.print("Haftal�k �ngilizce Dersi Saatini Giriniz: ");
		ingilizceSaat = scan.nextInt();
		System.out.print("�ngilizce Ortalaman�z� giriniz: ");
		ingilizceOrt = scan.nextInt();
		System.out.print("Haftal�k T�rk�e Dersi Saatini Giriniz: ");
		turkceSaat = scan.nextInt();
		System.out.print("T�rk�e Ortalaman�z� giriniz: ");
		turkceOrt = scan.nextInt();
		
	a��rl�kl�Not = matOrt*matSaat + fenOrt*fenSaat + sosyalOrt*sosyalSaat + ingilizceOrt*ingilizceSaat + turkceOrt*turkceSaat;
	toplamSaat = matSaat + fenSaat+ sosyalSaat+ ingilizceSaat+ turkceSaat;
	
	if (matOrt < 50 && fenOrt < 50 && sosyalOrt < 50 && ingilizceOrt < 50 && turkceOrt < 50) {
		System.out.println("Dersleriniz i�inden ortalamas� 50'den d���k ders oldu�u i�in hi�bir belge kazanamad�n�z.");
	}
	
	else if (a��rl�kl�Not/toplamSaat>=85) {
		System.out.println("Ortalaman�z: " + a��rl�kl�Not/toplamSaat );
		System.out.println("Takdir belgesi almaya hak kazand�n�z.");
	}
	
	else if (a��rl�kl�Not/toplamSaat>=70) {
		System.out.println("Ortalaman�z: " + a��rl�kl�Not/toplamSaat );
		System.out.println("Te�kk�r belgesi almaya hak kazand�n�z." );
	}
	else {
		System.out.println("Ortalaman�z: " + a��rl�kl�Not/toplamSaat );
		System.out.println("Bir belge kazanamad�n�z...");
		
	}
		
		
		
		
		
		
	}

}
