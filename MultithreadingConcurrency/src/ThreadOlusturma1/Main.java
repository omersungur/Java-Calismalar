package ThreadOlusturma1;

public class Main {

	public static void main(String[] args) { // Main �al��t��� anda main thread otomatik olu�ur.
		
		Printer printer1 = new Printer("printer1");
		Printer printer2 = new Printer("printer2");
		
		printer1.start(); // Thread ba�latma metodu
		printer2.start();
		
		System.out.println("Main Thread �al���yor...");

	}

}
