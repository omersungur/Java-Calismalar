import java.io.Serializable;

public class Serializationn implements Serializable{
	
	
	/* Serileþtirme iþlemi sayesinde dosyadaki verilerin tipleri korunduðu için JVM 
	 * bunu anlayarak baþka bir iþlem yapmadan gerekli olan deðerleri deðiþkenlerine atadý.
	 */
	
	
	// private transient int sayi; > transient anahtar kelimesi kullanýlýrsa o özellik serileþtirilemez anlamýna gelir ve okunurken default deðeri verilir.
	// static özellikler serileþtirilemez. 
	
	private static final long serialVersionUID = 1000; // class'ta herhangi bir özelliði deðiþtirmemizi engeller (Okurken hata verir).
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
		
		String bilgiler = "Öðrenci ismi: " + isim +
						  "\nÖðrenci numarasý: " + id + 
						  "\nÖgrenci bölümü: " + bolum;
		
		return bilgiler;
	}
	
}
