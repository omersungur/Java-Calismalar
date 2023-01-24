import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderDosyaOkuma {

	public static void main(String[] args) {
		
		//BufferedReader FileReader'a göre çok daha performanslý çalýþýr (Satýr satýr okuma vs karakter karakter okuma)
		
		try (Scanner s = new Scanner (new BufferedReader(new FileReader("ogrenciler.txt")))) { // Bu ifade sistemden okumak yerine dosyadan okuyacaðým anlamýna gelir.
			
			while (s.hasNextLine()) { // Bu ifade okuyacak baþka satýr kaldý mý diye kontrol eder (true or false döner).
				
				// System.out.println("Okunan satýr: " + s.nextLine()); > Bütün satýrlarý bu ifadeyle yazdýrabiliriz.
				
				String bolum_bilgisi = s.nextLine(); // Scanner'dan okunan deðeri deðiþkene atýyoruz.
				
				String [] array = bolum_bilgisi.split(","); // , karakterine göre satýrlarda parçalama yapýp diziye aktarýr.
				
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


