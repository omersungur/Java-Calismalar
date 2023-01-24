import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamileDosyayaVeriYazma {

	public static void main(String[] args) {
		
		FileOutputStream fos = null; // null baþlatmamýzýn sebebi bu nesneyi finally içinde kullanmak istememiz.
		// File file = new File ("dosyaa.t"); > aþaðýdaki kodun bir baþka kullanýmý
		
		try {
			fos = new FileOutputStream("dosya.t", true); // true ifadesi dosyaya yazýlan verilerin silinmesini engeller. (Önceden yazýlan ASCII kodlarý)
			
			fos.write(739); // ASCII koduna karþýlýk gelen karakteri dosyaya yazar.
			fos.write(68);
			fos.write(465);
			fos.write(65);
			
			byte array [] = {101,68,75};
			fos.write(array);
			
			String s = "ÖmerSungur";
			
			byte [] s_array = s.getBytes(); // Array içindeki bütün karakterleri byte'a çevirir.
			fos.write(s_array);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found exception oluþtu...");
			
			e.printStackTrace();
		} catch (IOException e) {
			
			System.out.println("IOException oluþtu...");
			e.printStackTrace();
		}
		
		finally {
			
			try {
				fos.close(); // Dosyayý kapattýk.
			} catch (IOException e) {
				
				System.out.println("Dosya kapatýlýrken bir hata oluþtu...");
			}
		}
	}
}
