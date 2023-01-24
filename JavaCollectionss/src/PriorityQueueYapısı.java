import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueYap�s� {

	public static void main(String[] args) {
		/*
	    Queue Interface ve PriorityQueue S�n�f�

	    PriorityQueue normal Queue mant��� gibi davranmaz. Elemanlar �ncelik s�ralar�na g�re y�ksek �ncelik kazan�p
	    (
	    Integerlarda en y�ksek �ncelik en k���k say�da, en d���k �ncelik  en b�y�k say�dad�r.
	    Stringlerde en y�ksek �ncelik alfabetik olarak s�zl�kte en �nce gelen stringte, 
	    en d���k �ncelik  alfabetik olarak s�zl�kte en son gelen stringtedir.

	    )

	    kuyrukta �nlere ge�er (T�pk� Hastanedeki Acil Servisler Gibi). 

	    add veya offer() metodlar� --------> Kuyru�a eleman ekler.(�nceden g�rd���m�z �zellikleri ta��rlar.)
	    clear() metodu --------> Kuyru�u Temizler.
	    contains(Object o) ------> o objesi kuyru�un i�indeyse true, de�ilse false d�ner.
	    peek() ------> Kuyru�un ba��ndaki eleman� d�ner.E�er kuyruk bo�sa null referans d�ner.
	    poll() -----> Kuyru�un ba��ndaki eleman� ��kart�r ve de�er olarak d�ner. E�er kuyruk bo�sa null referans d�ner.
	    size()------> Kuyru�un i�indeki eleman say�s�n� d�ner.
	    */
		
		
		Queue <Integer> qq = new PriorityQueue<>();
		
		// d�ng� i�inde s�ral� bas�lmaz.
		
		qq.offer(5);
		qq.offer(10);

	}

}
