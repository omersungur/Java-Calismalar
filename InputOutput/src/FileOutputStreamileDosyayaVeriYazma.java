import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamileDosyayaVeriYazma {

	public static void main(String[] args) {
		
		FileOutputStream fos = null; // null ba�latmam�z�n sebebi bu nesneyi finally i�inde kullanmak istememiz.
		// File file = new File ("dosyaa.t"); > a�a��daki kodun bir ba�ka kullan�m�
		
		try {
			fos = new FileOutputStream("dosya.t", true); // true ifadesi dosyaya yaz�lan verilerin silinmesini engeller. (�nceden yaz�lan ASCII kodlar�)
			
			fos.write(739); // ASCII koduna kar��l�k gelen karakteri dosyaya yazar.
			fos.write(68);
			fos.write(465);
			fos.write(65);
			
			byte array [] = {101,68,75};
			fos.write(array);
			
			String s = "�merSungur";
			
			byte [] s_array = s.getBytes(); // Array i�indeki b�t�n karakterleri byte'a �evirir.
			fos.write(s_array);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found exception olu�tu...");
			
			e.printStackTrace();
		} catch (IOException e) {
			
			System.out.println("IOException olu�tu...");
			e.printStackTrace();
		}
		
		finally {
			
			try {
				fos.close(); // Dosyay� kapatt�k.
			} catch (IOException e) {
				
				System.out.println("Dosya kapat�l�rken bir hata olu�tu...");
			}
		}
	}
}
