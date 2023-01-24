package GenericMethodlar;

public abstract class AdayOgrenci {
	
	private int turkce;
	private int matematik;
	private int edebiyat;
	private int fizik;
	
	public AdayOgrenci(int turkce, int matematik, int edebiyat, int fizik) {
		
		this.turkce = turkce;
		this.matematik = matematik;
		this.edebiyat = edebiyat;
		this.fizik = fizik;
	}

	public int getTurkce() {
		return turkce;
	}

	public void setTurkce(int turkce) {
		this.turkce = turkce;
	}

	public int getMatematik() {
		return matematik;
	}

	public void setMatematik(int matematik) {
		this.matematik = matematik;
	}

	public int getEdebiyat() {
		return edebiyat;
	}

	public void setEdebiyat(int edebiyat) {
		this.edebiyat = edebiyat;
	}

	public int getFizik() {
		return fizik;
	}

	public void setFizik(int fizik) {
		this.fizik = fizik;
	}
	
	public abstract int puanHesapla ();
	

}
