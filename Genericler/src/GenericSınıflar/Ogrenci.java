package GenericS�n�flar;

public class Ogrenci {
	
	private String isim;

	public Ogrenci(String isim) {
		
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() { // Bu �zel bir methoddur ve class i�in sout �a��r�l�rsa bu method �al���r.
		
		return "�sim: " + getIsim();
	}
	
	
	
	
	

}
