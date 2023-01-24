import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDosyayaVeriYazma {

	public static void main(String[] args) {
		
		FileWriter writerr = null;
		
		try {
			writerr = new FileWriter("dosyax.txt"); // true parametresi verilirse veriler silinmez.
			
			writerr.write("ÖmerSungaa\n"); // Dönüþüm yapmadan seri þekilde dosyaya veri yazdýk.
			
		} catch (IOException e) {
			
			System.out.println("Dosya açýlýrken bir hata oluþtu...");
		}
		
		finally {
			 
			if (writerr != null) {
				try {
					writerr.close();
				} catch (IOException e) {
					
					System.out.println("Dosya kapanýrken bir hata oluþtu...");
				}
			}
		}
	}
}
