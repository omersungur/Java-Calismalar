package ThreadOlusturma1;

public class Printer extends Thread { // 2.yol > extends etmek yerine runnable interface ini implement etseydik gene Thread  yapýsýný kullanabilirdik.
									  // runnable yapýsýný kullandýysak  Thread printer1 = new Thread (new Printer("...")) yapýsýný kullanýrýz.	
									  // 3.yol olarak anonim class þeklinde Thread yapýsýný kullanabiliriz.
	private String isim;

	public Printer(String isim) {
		this.isim = isim;
	}

	@Override
	public void run() { // Thread için bu methodu override ettik.
		
		System.out.println(isim + " çalýþýyor...");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + " Yazýyor: " + i);
			
			try {
				Thread.sleep(1000); // Her iþlem için 1 saniye sistemi bekletir.
			} catch (InterruptedException e) {
				
				System.out.println("Thread kesintiye uðradý");
			}
		}
		System.out.println(isim + " iþini bitirdi...");
	}
	
	
	
	
}
