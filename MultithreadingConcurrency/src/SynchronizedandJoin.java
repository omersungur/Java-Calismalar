
public class SynchronizedandJoin {

	private int count = 0 ;
	public synchronized void arttir () { // Senkronize ederek threadlerin sýrayla çalýþmasýný saðlýyoruz.
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
			thread1.join(); // Bu threadlerin Main Thread den önce çalýþmasý için öncelik tanýr.
			thread2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Count deðiþkeninin deðeri: " + count);
	}
	
	public static void main(String[] args) {
		
		SynchronizedandJoin threadsafe = new SynchronizedandJoin();
		threadsafe.threadleriCalistir();
	}
}
