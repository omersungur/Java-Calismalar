import java.util.LinkedList;
import java.util.Queue;

public class QueueYapýsý {

	public static void main(String[] args) {
		
	    /*
		* Queue(Kuyruk) Interface'ini implemente eden LinkedList Classý FIFO(First In, First Out Mantýðýyla Çalýþýr.) 
		* add(Eleman) ----> Elemaný Kuyruða Ekler. Ekleyemezse Hata Fýrlatýr.
		* offer(Eleman) ----> Elemaný Kuyruða Ekler. Eklerse True Döner, Ekleyemezse False Döner.
		* remove() ----> Kuyruðun en baþýndaki elemaný kuyruktan çýkarýr. Kuyruk boþsa hata fýrlatýr.
		* poll() ------> Kuyruðun en baþýndaki elemaný kuyruktan çýkarýr. Kuyruk boþsa null referans döner.
		* element() ----> Kuyruðun en baþýndaki elemaný döner. Kuyruk boþsa ,  hata fýrlatýr.
		* peek() ------> Kuyruðun en baþýndaki elemaný döner. Kuyruk boþsa , null referans döner.
		*/
		
		Queue <String> qq = new LinkedList<>(); // Linkedlist yapýsýndan oluþur.
		
		qq.offer("Java");
		qq.offer("Python");
		qq.offer("C++");
		qq.offer("Php");
		
		
		while (!qq.isEmpty()) {
			
			System.out.println(qq.poll());
		}
		
		System.out.println(qq.peek()); // while döngüsünde bütün elemanlarý yazdýrýp bu elemanlarý kuyruktan çýkartýðýmýz için null döner.

	}

}
