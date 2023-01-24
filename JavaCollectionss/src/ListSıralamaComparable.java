import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Playerss implements Comparable<Playerss> {
	private String isim;

	private int id;

	public Playerss(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}

	@Override
	public String toString() {
		return "|||| ID: " + id + " �sim :" + isim + " |||";

	}

	@Override
	public int compareTo(Playerss player) {

		if (this.id < player.id) {

			return -1; // K���kten b�y��e s�ralamak i�in ilk ko�ulda - herhangi bir de�er girilir.

		} else if (this.id > player.id) {
			return 1;

		}
		return 0;

	}

}

public class ListS�ralamaComparable {
	
	public static void main(String[] args) {

		List<Playerss> list_player = new ArrayList<Playerss>();
        
        list_player.add(new Playerss("�mer", 5));
        list_player.add(new Playerss("Emre", 1));
        list_player.add(new Playerss("O�uz", 10));
        list_player.add(new Playerss("Yusuf", 4));

        Collections.sort(list_player); // Kendi Class'�m�z�n Comparable interface'i olmad��� i�in kendimiz dahil ettikten sonra s�ralayabiliriz.
        
        for (Playerss p: list_player) {
        	System.out.println(p);
        }
	}
}