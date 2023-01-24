package ThreadHavuzlariExecutor;

public class Worker implements Runnable{
	
	private String isim;
	private int taskId;
	
	
	public Worker(String isim, int taskId) {
		this.isim = isim;
		this.taskId = taskId;
	}


	@Override
	public void run() {
		try {
			System.out.println("Worker " + isim + " " + taskId +". i�e ba�lad�...");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Worker " + isim + " " + taskId +". i�i bitirdi...");
	}
	
	

}
