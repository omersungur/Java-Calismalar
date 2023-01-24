import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueYapýsý {

	public static void main(String[] args) {
		/*
	    Queue Interface ve PriorityQueue Sýnýfý

	    PriorityQueue normal Queue mantýðý gibi davranmaz. Elemanlar öncelik sýralarýna göre yüksek öncelik kazanýp
	    (
	    Integerlarda en yüksek öncelik en küçük sayýda, en düþük öncelik  en büyük sayýdadýr.
	    Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte, 
	    en düþük öncelik  alfabetik olarak sözlükte en son gelen stringtedir.

	    )

	    kuyrukta önlere geçer (Týpký Hastanedeki Acil Servisler Gibi). 

	    add veya offer() metodlarý --------> Kuyruða eleman ekler.(Önceden gördüðümüz özellikleri taþýrlar.)
	    clear() metodu --------> Kuyruðu Temizler.
	    contains(Object o) ------> o objesi kuyruðun içindeyse true, deðilse false döner.
	    peek() ------> Kuyruðun baþýndaki elemaný döner.Eðer kuyruk boþsa null referans döner.
	    poll() -----> Kuyruðun baþýndaki elemaný çýkartýr ve deðer olarak döner. Eðer kuyruk boþsa null referans döner.
	    size()------> Kuyruðun içindeki eleman sayýsýný döner.
	    */
		
		
		Queue <Integer> qq = new PriorityQueue<>();
		
		// döngü içinde sýralý basýlmaz.
		
		qq.offer(5);
		qq.offer(10);

	}

}
