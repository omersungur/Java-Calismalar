package ReentrantLockConditionSinifi;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReeLock {

	private int say = 0;
	
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition(); // wait ve notify metodlar�n� kullanabilmek i�in tan�mlad�k.
	
	public void artir () {
		for (int i = 0; i < 10000; i++) {
			say++;
		}
	}
	
	public void thread1fonk () {
	
		
		
		lock.lock(); // Anahtar� kitlemi� olduk. Unlock yapmadan bunun alt�nda hi�bir yere thread giremez.
		System.out.println("Thread1 �al���yor...");
		System.out.println("Thread1 uyand�r�lmay� bekliyor...");
		try {
			condition.await(); // uyutma i�lemi
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Thread1 uyand�r�ld� ve i�lemine devam ediyor...");
		
		artir();
		lock.unlock();
		
	}
	
	public void thread2fonk () {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Scanner s = new Scanner (System.in);
		
		
		lock.lock();
		
		System.out.println("Thread2 �al���yor...");
		
		artir();
		System.out.println("Devam etmek i�in bir tu�a bas�n�z.");
		s.nextLine();
		condition.signal(); // uyand�rma i�lemi
		System.out.println("Thread1'i uyand�rd�m...");
		lock.unlock();
	}
	
	public void threadover () {
		System.out.println("De�er: " + say);
	}
}
