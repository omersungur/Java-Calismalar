import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDosyaOkuma {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner (new FileReader("ogrenciler.txt"))) { // Bu ifade sistemden okumak yerine dosyadan okuyaca��m anlam�na gelir.
			
			while (s.hasNextLine()) { // Bu ifade okuyacak ba�ka sat�r kald� m� diye kontrol eder (true or false d�ner).
				
				// System.out.println("Okunan sat�r: " + s.nextLine()); > B�t�n sat�rlar� bu ifadeyle yazd�rabiliriz.
				
				String bolum_bilgisi = s.nextLine(); // Scanner'dan okunan de�eri de�i�kene at�yoruz.
				
				String [] array = bolum_bilgisi.split(","); // , karakterine g�re ilk sat�rda iki par�aya b�ler.
				
				if (array[1].equals("Yat�r�mc�")) {
					System.out.println("Okunan Sat�r: " + bolum_bilgisi);
				}
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Dosya Bulunamad�...");
			
		} catch (IOException e) {
			
			System.out.println("Dosya a��l�rken bir hata olu�tu...");
		}
		
	}

}
