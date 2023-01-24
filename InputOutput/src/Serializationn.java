import java.io.Serializable;

public class Serializationn implements Serializable{
	
	
	/* Serile�tirme i�lemi sayesinde dosyadaki verilerin tipleri korundu�u i�in JVM 
	 * bunu anlayarak ba�ka bir i�lem yapmadan gerekli olan de�erleri de�i�kenlerine atad�.
	 */
	
	
	// private transient int sayi; > transient anahtar kelimesi kullan�l�rsa o �zellik serile�tirilemez anlam�na gelir ve okunurken default de�eri verilir.
	// static �zellikler serile�tirilemez. 
	
	private static final long serialVersionUID = 1000; // class'ta herhangi bir �zelli�i de�i�tirmemizi engeller (Okurken hata verir).
	private String isim;
	private int id;
	private String bolum;
	
	
	public Serializationn(String isim, int id, String bolum) {
		
		this.isim = isim;
		this.id = id;
		this.bolum = bolum;
	}

	@Override
	public String toString() {
		
		String bilgiler = "��renci ismi: " + isim +
						  "\n��renci numaras�: " + id + 
						  "\n�grenci b�l�m�: " + bolum;
		
		return bilgiler;
	}
	
}
