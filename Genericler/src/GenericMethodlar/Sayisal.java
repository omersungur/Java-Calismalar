package GenericMethodlar;

public class Sayisal extends AdayOgrenci{

	public Sayisal(int turkce, int matematik, int edebiyat, int fizik) {
		super(turkce, matematik, edebiyat, fizik);
	
	}

	@Override
	public int puanHesapla() {
		
		return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;
	}

}
