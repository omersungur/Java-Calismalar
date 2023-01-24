
public class TryCatch {

	public static void main(String[] args) {
		
		// Eðer try bloðu içinde bi exception varsa catch içindeki ifade bunu yakalar ve catch bloðu çalýþýr. Exception yoksa iki bloðada girmez.
		// Birden fazla catch bloðu yazabiliriz fakat sýralarý özelden genele doðru olmalý.
		
		try {
			int dizi [] = {1,2,3,4,5};
			System.out.println(dizi[5]); 
			int a = 30/0;  // Aritmetik Exception
		}
		
		catch (ArithmeticException e) {
			System.out.println();
		}
		catch (Exception e){
			System.out.println("Dizinin böyle bir elemaný yok.");
			e.printStackTrace(); // e referansýyla hangi hata varsa onu yazdýrýyoruz.
		}
		
		finally {
			System.out.println("Burasý kesinlikle çalýþýr.");
			// Finally bloðu her zaman çalýþýr.(exception yakalansýn yakalanmasýn farketmez)
		}
		
		// catch (ArithmeticException | ArrayIndexOutOfBoundsException e) > bir catch içinde birden fazla hata yakalamanýn kýsa yolu.
		
	}

}
