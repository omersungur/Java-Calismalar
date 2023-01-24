package WaitNotify;

import java.util.Scanner;

public class WaitNotifyy {

	private Object lock = new Object();
	
	public void thread1Fonk () {
		
		synchronized (lock) { // synchronized (this) ile de kullan�labilir.
			System.out.println("Thread 1 �al���yor...");
			System.out.println("Thread 1 Thread2'nin kendisini uyand�rmas�n� bekliyor...");
			
			try {
				lock.wait(); // Bu Threadi uyutma i�lemi yapar. Uyand�r�lmazsa ba�ka hi�bir i�lem yapamaz.
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Thread 1 uyand�. Devam ediyor...");
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
			System.out.println("Thread 2 �al���yor...");
			
			System.out.println("Devam etmek i�in bir tu�a bas�n�z.");
			
			scan.nextLine();
			
			lock.notify(); // Thread 1'i uyand�r�r.
			
			System.out.println("Uyand�rd�m...");
		}
	}
}
