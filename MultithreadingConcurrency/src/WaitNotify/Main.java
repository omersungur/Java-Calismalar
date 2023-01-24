package WaitNotify;

public class Main {

	public static void main(String[] args) {
		
		WaitNotifyy wn = new WaitNotifyy();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				wn.thread1Fonk();
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				wn.thread2Fonk();
				
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
}
