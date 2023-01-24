import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDosyadanVeriAlma {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("dosya.txt");
			
			// System.out.println("Okunan Karakter: " + (char) fis.read()); > ilk karakteri okur bi da �al���rsa 2. karakteri okur.
			
			// fis.skip(5); // Metnin ba�lang�c�ndan 5 imle� atla anlam�na gelir.
			
			// System.out.println((char)fis.read()); 
			//fis.read() > okuyaca�� bir byte kalmad��� zaman -1 de�erini d�ner.
			
			int deger;
			String s = "";
			
			while ((deger = fis.read()) != -1) { // fis.read() ilk olarak de�ere atan�yor ve de�er -1 mi diye kontrol ediliyor.
				s += (char) deger; // ASCII kodlu her de�er de�ikenini bir karaktere d�n��t�r�p s adl� de�i�kene toplam olarak aktard�k.
				
			}
			System.out.print(s);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Dosya bulunamad�");
		} catch (IOException e) {
			
			System.out.println("Dosya okunurken bir hata olu�tu...");
		}
		
		finally {
			
			try {
				if (fis != null) { // �f kullanmasayd�k, dosya a��ld���nda bir hata olu�ursa dosya kapanmazd�.
					
					fis.close();
				}
				
			} catch (IOException e) {
				
				System.out.println("Dosya kapat�l�rken bir hata olu�tu...");
			}
		}
		
		
	}

}
