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
		return "|||| ID: " + id + " Ýsim :" + isim + " |||";

	}

	@Override
	public int compareTo(Playerss player) {

		if (this.id < player.id) {

			return -1; // Küçükten büyüðe sýralamak için ilk koþulda - herhangi bir deðer girilir.

		} else if (this.id > player.id) {
			return 1;

		}
		return 0;

	}

}

public class ListSýralamaComparable {
	
	public static void main(String[] args) {

		List<Playerss> list_player = new ArrayList<Playerss>();
        
        list_player.add(new Playerss("Ömer", 5));
        list_player.add(new Playerss("Emre", 1));
        list_player.add(new Playerss("Oðuz", 10));
        list_player.add(new Playerss("Yusuf", 4));

        Collections.sort(list_player); // Kendi Class'ýmýzýn Comparable interface'i olmadýðý için kendimiz dahil ettikten sonra sýralayabiliriz.
        
        for (Playerss p: list_player) {
        	System.out.println(p);
        }
	}
}