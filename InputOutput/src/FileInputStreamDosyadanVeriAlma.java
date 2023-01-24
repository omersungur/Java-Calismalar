import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDosyadanVeriAlma {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("dosya.txt");
			
			// System.out.println("Okunan Karakter: " + (char) fis.read()); > ilk karakteri okur bi da çalýþýrsa 2. karakteri okur.
			
			// fis.skip(5); // Metnin baþlangýcýndan 5 imleç atla anlamýna gelir.
			
			// System.out.println((char)fis.read()); 
			//fis.read() > okuyacaðý bir byte kalmadýðý zaman -1 deðerini döner.
			
			int deger;
			String s = "";
			
			while ((deger = fis.read()) != -1) { // fis.read() ilk olarak deðere atanýyor ve deðer -1 mi diye kontrol ediliyor.
				s += (char) deger; // ASCII kodlu her deðer deþikenini bir karaktere dönüþtürüp s adlý deðiþkene toplam olarak aktardýk.
				
			}
			System.out.print(s);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Dosya bulunamadý");
		} catch (IOException e) {
			
			System.out.println("Dosya okunurken bir hata oluþtu...");
		}
		
		finally {
			
			try {
				if (fis != null) { // Ýf kullanmasaydýk, dosya açýldýðýnda bir hata oluþursa dosya kapanmazdý.
					
					fis.close();
				}
				
			} catch (IOException e) {
				
				System.out.println("Dosya kapatýlýrken bir hata oluþtu...");
			}
		}
		
		
	}

}
