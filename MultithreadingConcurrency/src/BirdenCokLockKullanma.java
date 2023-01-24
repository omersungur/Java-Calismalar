import java.util.ArrayList;
import java.util.Random;

public class BirdenCokLockKullanma {

	Random random = new Random();

	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public void list1DegerEkle() {
		synchronized (lock1) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			list1.add(random.nextInt(100));
		}
	}

	public void list2DegerEkle() {
		synchronized (lock2) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			list2.add(random.nextInt(100));
		}
	}

	public void degerAta() {

		for (int i = 0; i < 1000; i++) {
			list1DegerEkle();
			list2DegerEkle();
		}

	}

	public void calistir() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				degerAta();

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				degerAta();

			}
		});

		long baslangýc = System.currentTimeMillis();
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("List1'in eleman sayýsý: " + list1.size() + " List2'nin eleman sayýsý: " + list2.size());

		long bitis = System.currentTimeMillis();

		System.out.println("Geçen süre: " + (bitis - baslangýc));
		
		

	}

}
