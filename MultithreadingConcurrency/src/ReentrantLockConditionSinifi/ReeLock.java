package ReentrantLockConditionSinifi;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReeLock {

	private int say = 0;
	
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition(); // wait ve notify metodlarýný kullanabilmek için tanýmladýk.
	
	public void artir () {
		for (int i = 0; i < 10000; i++) {
			say++;
		}
	}
	
	public void thread1fonk () {
	
		
		
		lock.lock(); // Anahtarý kitlemiþ olduk. Unlock yapmadan bunun altýnda hiçbir yere thread giremez.
		System.out.println("Thread1 çalýþýyor...");
		System.out.println("Thread1 uyandýrýlmayý bekliyor...");
		try {
			condition.await(); // uyutma iþlemi
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Thread1 uyandýrýldý ve iþlemine devam ediyor...");
		
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
		
		System.out.println("Thread2 çalýþýyor...");
		
		artir();
		System.out.println("Devam etmek için bir tuþa basýnýz.");
		s.nextLine();
		condition.signal(); // uyandýrma iþlemi
		System.out.println("Thread1'i uyandýrdým...");
		lock.unlock();
	}
	
	public void threadover () {
		System.out.println("Deðer: " + say);
	}
}
