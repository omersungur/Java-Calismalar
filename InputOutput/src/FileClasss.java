import java.io.File;
import java.io.IOException;

public class FileClasss {

	public static void main(String[] args) {
		
		File f = new File ("C:\\Users\\ÖMER\\eclipse-workspace\\InputOutput\\FileDeneme");
		
		System.out.println(f.getName()); // Dosyanýn ismini yazdýrma
		System.out.println(f.getAbsolutePath()); // Dosya yolunu gösterir.
		try {
			f.createNewFile(); // Dosya oluþturma
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		System.out.println(f.delete()); // Dosyayý silme.
		System.out.println(f.exists()); // Dosyanýn varlýðýný kontrol eder.
		f.mkdir(); // Klasör oluþturma
		
		if (f.canRead() == true && f.canWrite() == true) {
			System.out.println("Dosya hem okunabilir hem yazýlabilir");
		}
	}

}
