package ThreadOlusturma1;

public class Main {

	public static void main(String[] args) { // Main çalýþtýðý anda main thread otomatik oluþur.
		
		Printer printer1 = new Printer("printer1");
		Printer printer2 = new Printer("printer2");
		
		printer1.start(); // Thread baþlatma metodu
		printer2.start();
		
		System.out.println("Main Thread çalýþýyor...");

	}

}
