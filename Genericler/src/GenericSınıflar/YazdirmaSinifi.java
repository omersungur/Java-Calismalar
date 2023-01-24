package GenericSýnýflar;

public class YazdirmaSinifi <E> { // Buradaki E ifadesi generic bir yapý belirtiyor.
	
	public  void yazdirma (E [] dizi) { // E yerine ne verilirse(String,int...) E onun gibi davranýr ve Genericler static olamazlar.
		
		for (E e : dizi) {
			System.out.println(e);
		}
	}
	
	// Generic classlarýn amacý birden fazla sýnýfla uðraþmayýp genel bir sýnýf yazýp bütün iþlemleri burada yaptýrabilmektir.

}
