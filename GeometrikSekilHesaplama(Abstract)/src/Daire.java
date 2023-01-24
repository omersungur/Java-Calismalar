
public class Daire extends Sekil{

	private int yaricap;
	
	public Daire(String isim, int yaricap) {
		super(isim);
		this.yaricap = yaricap;
		
	}

	
	public void alan_hesapla() {
		
		System.out.println(getIsim() + " in alaný: " + (Math.PI*yaricap*yaricap));
		
	}

}
