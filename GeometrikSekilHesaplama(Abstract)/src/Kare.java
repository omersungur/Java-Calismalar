
public class Kare extends Sekil{

	private int kenar;
	
	public Kare(String isim, int kenar) {
		super(isim);
		this.kenar = kenar;
		
	}

	
	public void alan_hesapla() {
	
		System.out.println(getIsim() + " in alan�: " + (kenar*kenar));
		
	}

}
