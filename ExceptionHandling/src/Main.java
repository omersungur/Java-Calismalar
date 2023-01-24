import java.util.Scanner;

public class Main {

	public static void mekan_kontrol (int yas) {
		
		if (yas < 18) {
			throw new OznelExceptionClass("Invalid Age Exception");
		}
		
		else {
			System.out.println("Mekana Ho�geldiniz...");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ya��n�z� giriniz: ");
		
		int yas = scan.nextInt();
		
		try {
		mekan_kontrol(yas); 
		}
		
		catch (OznelExceptionClass e){
			e.printStackTrace();
			System.out.println(e);
		}
		

	}

}
