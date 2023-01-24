import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	Random random = new Random();
	
	BlockingQueue<Integer> queuee= new ArrayBlockingQueue<>(10);
	
	public void produce () {
		
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			try {
				Integer value = random.nextInt(100);
				
				System.out.println("Producer üretiyor: " + value);
				queuee.put(value);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	public void consume () {
		
		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			try {
				Integer valuee = queuee.take();
				System.out.println("Consumer tüketiyor: " + valuee);
				
				System.out.println("Size:" + queuee.size());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
