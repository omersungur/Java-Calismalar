import java.io.File;
import java.io.IOException;

public class FileClasss {

	public static void main(String[] args) {
		
		File f = new File ("C:\\Users\\�MER\\eclipse-workspace\\InputOutput\\FileDeneme");
		
		System.out.println(f.getName()); // Dosyan�n ismini yazd�rma
		System.out.println(f.getAbsolutePath()); // Dosya yolunu g�sterir.
		try {
			f.createNewFile(); // Dosya olu�turma
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		System.out.println(f.delete()); // Dosyay� silme.
		System.out.println(f.exists()); // Dosyan�n varl���n� kontrol eder.
		f.mkdir(); // Klas�r olu�turma
		
		if (f.canRead() == true && f.canWrite() == true) {
			System.out.println("Dosya hem okunabilir hem yaz�labilir");
		}
	}

}
