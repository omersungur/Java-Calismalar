
public class Main2 {

	public static void main(String[] args) {
		
		System.out.println("omer".compareTo("�mer")); // o harfi � harfinden �nce geldi�i i�in de�er negatif d�nd�.
		System.out.println("�mer".compareTo("ali")); // � harfi a harfinden sonra geldi�i i�in de�er pozitif d�nd�. (� > a)

		String s = "�mer Sungur Deneme";
		char [] diziA = new char [4];
		
		s.getChars(0, 4, diziA, 0); //0'dan 4. indise kadar kopyalar 4 dahil de�ildir. Ayr�ca 4'ten b�y�k yazamay�z.
		System.out.println(diziA);
	}

}
