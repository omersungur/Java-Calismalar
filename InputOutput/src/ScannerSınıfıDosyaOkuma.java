import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerS�n�f�DosyaOkuma {

	public static void main(String[] args) {
		
		
		File f = new File("C:\\Users\\�MER\\eclipse-workspace\\InputOutput\\diller.txt");
		
		try {
			Scanner s = new Scanner (f);
			while (s.hasNextLine()) {
				String veri = s.nextLine();
				System.out.println(veri);
				
						
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("Bir hata olu�tu");
		}
		

	}

}
