
public class TryCatch {

	public static void main(String[] args) {
		
		// E�er try blo�u i�inde bi exception varsa catch i�indeki ifade bunu yakalar ve catch blo�u �al���r. Exception yoksa iki blo�ada girmez.
		// Birden fazla catch blo�u yazabiliriz fakat s�ralar� �zelden genele do�ru olmal�.
		
		try {
			int dizi [] = {1,2,3,4,5};
			System.out.println(dizi[5]); 
			int a = 30/0;  // Aritmetik Exception
		}
		
		catch (ArithmeticException e) {
			System.out.println();
		}
		catch (Exception e){
			System.out.println("Dizinin b�yle bir eleman� yok.");
			e.printStackTrace(); // e referans�yla hangi hata varsa onu yazd�r�yoruz.
		}
		
		finally {
			System.out.println("Buras� kesinlikle �al���r.");
			// Finally blo�u her zaman �al���r.(exception yakalans�n yakalanmas�n farketmez)
		}
		
		// catch (ArithmeticException | ArrayIndexOutOfBoundsException e) > bir catch i�inde birden fazla hata yakalaman�n k�sa yolu.
		
	}

}
