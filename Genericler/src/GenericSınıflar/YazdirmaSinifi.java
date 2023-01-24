package GenericS�n�flar;

public class YazdirmaSinifi <E> { // Buradaki E ifadesi generic bir yap� belirtiyor.
	
	public  void yazdirma (E [] dizi) { // E yerine ne verilirse(String,int...) E onun gibi davran�r ve Genericler static olamazlar.
		
		for (E e : dizi) {
			System.out.println(e);
		}
	}
	
	// Generic classlar�n amac� birden fazla s�n�fla u�ra�may�p genel bir s�n�f yaz�p b�t�n i�lemleri burada yapt�rabilmektir.

}
