import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDosyaOkuma {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner (new FileReader("ogrenciler.txt"))) { // Bu ifade sistemden okumak yerine dosyadan okuyacaðým anlamýna gelir.
			
			while (s.hasNextLine()) { // Bu ifade okuyacak baþka satýr kaldý mý diye kontrol eder (true or false döner).
				
				// System.out.println("Okunan satýr: " + s.nextLine()); > Bütün satýrlarý bu ifadeyle yazdýrabiliriz.
				
				String bolum_bilgisi = s.nextLine(); // Scanner'dan okunan deðeri deðiþkene atýyoruz.
				
				String [] array = bolum_bilgisi.split(","); // , karakterine göre ilk satýrda iki parçaya böler.
				
				if (array[1].equals("Yatýrýmcý")) {
					System.out.println("Okunan Satýr: " + bolum_bilgisi);
				}
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Dosya Bulunamadý...");
			
		} catch (IOException e) {
			
			System.out.println("Dosya açýlýrken bir hata oluþtu...");
		}
		
	}

}
