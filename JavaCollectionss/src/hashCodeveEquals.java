import java.util.HashSet;
import java.util.Set;

class Player {
	private String isim;
	private int id;
	
	
	
	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		
		return "ID: " + id + " Ýsim: " + isim;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((isim == null) ? 0 : isim.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		if (isim == null) {
			if (other.isim != null)
				return false;
		} else if (!isim.equals(other.isim))
			return false;
		return true;
	}
	
	
	
}


public class hashCodeveEquals {


	public static void main(String[] args) {
		
		Set<Player> hashsett = new HashSet<>();

		Player player1 = new Player("Ömer", 1);
		Player player2 = new Player("Musa", 10);
		Player player3 = new Player("Hakan", 6);
		Player player4 = new Player("Ömer", 1);
		
		hashsett.add(player1);
		hashsett.add(player2);
		hashsett.add(player3);
		hashsett.add(player4);
		
		for (Player p: hashsett) {
			System.out.println(p);
		}
		
		// Kendi yazdýðýmýz bir class için hashCode ve equals metodlarýný kullanmazsak deðerleri ayný olan ifadeler tekrar yazýlýr.

	}

}
