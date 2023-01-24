import java.util.LinkedList;
import java.util.Queue;

public class QueueYap�s� {

	public static void main(String[] args) {
		
	    /*
		* Queue(Kuyruk) Interface'ini implemente eden LinkedList Class� FIFO(First In, First Out Mant���yla �al���r.) 
		* add(Eleman) ----> Eleman� Kuyru�a Ekler. Ekleyemezse Hata F�rlat�r.
		* offer(Eleman) ----> Eleman� Kuyru�a Ekler. Eklerse True D�ner, Ekleyemezse False D�ner.
		* remove() ----> Kuyru�un en ba��ndaki eleman� kuyruktan ��kar�r. Kuyruk bo�sa hata f�rlat�r.
		* poll() ------> Kuyru�un en ba��ndaki eleman� kuyruktan ��kar�r. Kuyruk bo�sa null referans d�ner.
		* element() ----> Kuyru�un en ba��ndaki eleman� d�ner. Kuyruk bo�sa ,  hata f�rlat�r.
		* peek() ------> Kuyru�un en ba��ndaki eleman� d�ner. Kuyruk bo�sa , null referans d�ner.
		*/
		
		Queue <String> qq = new LinkedList<>(); // Linkedlist yap�s�ndan olu�ur.
		
		qq.offer("Java");
		qq.offer("Python");
		qq.offer("C++");
		qq.offer("Php");
		
		
		while (!qq.isEmpty()) {
			
			System.out.println(qq.poll());
		}
		
		System.out.println(qq.peek()); // while d�ng�s�nde b�t�n elemanlar� yazd�r�p bu elemanlar� kuyruktan ��kart���m�z i�in null d�ner.

	}

}
