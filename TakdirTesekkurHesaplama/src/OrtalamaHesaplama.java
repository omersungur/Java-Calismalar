import java.util.Scanner;

public class OrtalamaHesaplama {
	
	public void calis (Hesap hesap) {
		Login login = new Login();
		
		Scanner scan = new Scanner (System.in);
		
		while (true)  {
			if (login.loginn(hesap)) {
				System.out.println("Giriþ baþarýlý...");
				break;
			}
			else {
				System.out.println("Giriþ baþarýsýz...");
				return;
			}
		}
		
		int matOrt, fenOrt, sosyalOrt, ingilizceOrt, turkceOrt, aðýrlýklýNot;
		int matSaat, fenSaat, sosyalSaat, ingilizceSaat, turkceSaat, toplamSaat;
		
		System.out.print("Haftalýk Matematik Dersi Saatini Giriniz: ");
		matSaat = scan.nextInt();
		System.out.print("Matematik Ortalamanýzý giriniz: ");
		matOrt = scan.nextInt();
		System.out.print("Haftalýk Fen Dersi Saatini Giriniz: ");
		fenSaat = scan.nextInt();
		System.out.print("Fen Ortalamanýzý giriniz: ");
		fenOrt = scan.nextInt();
		System.out.print("Haftalýk Sosyal Dersi Saatini Giriniz: ");
		sosyalSaat = scan.nextInt();
		System.out.print("Sosyal Ortalamanýzý giriniz: ");
		sosyalOrt = scan.nextInt();
		System.out.print("Haftalýk Ýngilizce Dersi Saatini Giriniz: ");
		ingilizceSaat = scan.nextInt();
		System.out.print("Ýngilizce Ortalamanýzý giriniz: ");
		ingilizceOrt = scan.nextInt();
		System.out.print("Haftalýk Türkçe Dersi Saatini Giriniz: ");
		turkceSaat = scan.nextInt();
		System.out.print("Türkçe Ortalamanýzý giriniz: ");
		turkceOrt = scan.nextInt();
		
	aðýrlýklýNot = matOrt*matSaat + fenOrt*fenSaat + sosyalOrt*sosyalSaat + ingilizceOrt*ingilizceSaat + turkceOrt*turkceSaat;
	toplamSaat = matSaat + fenSaat+ sosyalSaat+ ingilizceSaat+ turkceSaat;
	
	if (matOrt < 50 && fenOrt < 50 && sosyalOrt < 50 && ingilizceOrt < 50 && turkceOrt < 50) {
		System.out.println("Dersleriniz içinden ortalamasý 50'den düþük ders olduðu için hiçbir belge kazanamadýnýz.");
	}
	
	else if (aðýrlýklýNot/toplamSaat>=85) {
		System.out.println("Ortalamanýz: " + aðýrlýklýNot/toplamSaat );
		System.out.println("Takdir belgesi almaya hak kazandýnýz.");
	}
	
	else if (aðýrlýklýNot/toplamSaat>=70) {
		System.out.println("Ortalamanýz: " + aðýrlýklýNot/toplamSaat );
		System.out.println("Teþkkür belgesi almaya hak kazandýnýz." );
	}
	else {
		System.out.println("Ortalamanýz: " + aðýrlýklýNot/toplamSaat );
		System.out.println("Bir belge kazanamadýnýz...");
		
	}
		
		
		
		
		
		
	}

}
