package ThreadOlusturma1;

public class Printer extends Thread { // 2.yol > extends etmek yerine runnable interface ini implement etseydik gene Thread  yap�s�n� kullanabilirdik.
									  // runnable yap�s�n� kulland�ysak  Thread printer1 = new Thread (new Printer("...")) yap�s�n� kullan�r�z.	
									  // 3.yol olarak anonim class �eklinde Thread yap�s�n� kullanabiliriz.
	private String isim;

	public Printer(String isim) {
		this.isim = isim;
	}

	@Override
	public void run() { // Thread i�in bu methodu override ettik.
		
		System.out.println(isim + " �al���yor...");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + " Yaz�yor: " + i);
			
			try {
				Thread.sleep(1000); // Her i�lem i�in 1 saniye sistemi bekletir.
			} catch (InterruptedException e) {
				
				System.out.println("Thread kesintiye u�rad�");
			}
		}
		System.out.println(isim + " i�ini bitirdi...");
	}
	
	
	
	
}
