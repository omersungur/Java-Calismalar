package WaitNotify;

import java.util.Scanner;

public class WaitNotifyy {

	private Object lock = new Object();
	
	public void thread1Fonk () {
		
		synchronized (lock) { // synchronized (this) ile de kullanýlabilir.
			System.out.println("Thread 1 Çalýþýyor...");
			System.out.println("Thread 1 Thread2'nin kendisini uyandýrmasýný bekliyor...");
			
			try {
				lock.wait(); // Bu Threadi uyutma iþlemi yapar. Uyandýrýlmazsa baþka hiçbir iþlem yapamaz.
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Thread 1 uyandý. Devam ediyor...");
		}
	}
	
	public void thread2Fonk () {
		Scanner scan = new Scanner (System.in);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		synchronized (lock) {
			System.out.println("Thread 2 çalýþýyor...");
			
			System.out.println("Devam etmek için bir tuþa basýnýz.");
			
			scan.nextLine();
			
			lock.notify(); // Thread 1'i uyandýrýr.
			
			System.out.println("Uyandýrdým...");
		}
	}
}
