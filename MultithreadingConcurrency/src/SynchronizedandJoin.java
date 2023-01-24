
public class SynchronizedandJoin {

	private int count = 0 ;
	public synchronized void arttir () { // Senkronize ederek threadlerin s�rayla �al��mas�n� sa�l�yoruz.
		count++;
	}
	public void threadleriCalistir() {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 5000; i++) {
					arttir();
				}
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 5000; i++) {
					arttir();
				}
				
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join(); // Bu threadlerin Main Thread den �nce �al��mas� i�in �ncelik tan�r.
			thread2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Count de�i�keninin de�eri: " + count);
	}
	
	public static void main(String[] args) {
		
		SynchronizedandJoin threadsafe = new SynchronizedandJoin();
		threadsafe.threadleriCalistir();
	}
}
