
public class Main2 {

	public static void main(String[] args) {
		
		System.out.println("omer".compareTo("ömer")); // o harfi ö harfinden önce geldiði için deðer negatif döndü.
		System.out.println("ömer".compareTo("ali")); // ö harfi a harfinden sonra geldiði için deðer pozitif döndü. (ö > a)

		String s = "Ömer Sungur Deneme";
		char [] diziA = new char [4];
		
		s.getChars(0, 4, diziA, 0); //0'dan 4. indise kadar kopyalar 4 dahil deðildir. Ayrýca 4'ten büyük yazamayýz.
		System.out.println(diziA);
	}

}
