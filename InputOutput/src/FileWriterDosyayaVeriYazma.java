import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDosyayaVeriYazma {

	public static void main(String[] args) {
		
		FileWriter writerr = null;
		
		try {
			writerr = new FileWriter("dosyax.txt"); // true parametresi verilirse veriler silinmez.
			
			writerr.write("�merSungaa\n"); // D�n���m yapmadan seri �ekilde dosyaya veri yazd�k.
			
		} catch (IOException e) {
			
			System.out.println("Dosya a��l�rken bir hata olu�tu...");
		}
		
		finally {
			 
			if (writerr != null) {
				try {
					writerr.close();
				} catch (IOException e) {
					
					System.out.println("Dosya kapan�rken bir hata olu�tu...");
				}
			}
		}
	}
}
