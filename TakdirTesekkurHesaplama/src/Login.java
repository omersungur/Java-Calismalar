import java.util.Scanner;

public class Login {

	public boolean loginn (Hesap hesap) {
		
		String tcNo;
		String okulNo;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("TC Kimlik numaran�z� giriniz: ");
		tcNo = scan.nextLine();
		System.out.println("Okul numaran�z� giriniz:");
		okulNo = scan.nextLine();
		
		if (tcNo.equals(hesap.tcno) && okulNo.equals(hesap.okulno)) {
			return true;
		}
		else {
			return false;
			}
	}
}
