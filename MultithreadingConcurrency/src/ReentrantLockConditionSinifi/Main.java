package ReentrantLockConditionSinifi;

public class Main {
	
	public static void main(String[] args) {
		
		ReeLock ree = new ReeLock();
		
		Thread thread1 = new Thread (new Runnable() {
			
			@Override
			public void run() {
				ree.thread1fonk();
				
			}
		});
		
		Thread thread2 = new Thread (new Runnable() {
			
			@Override
			public void run() {
				ree.thread2fonk();
				
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
		
		ree.threadover();
		
	}

}

