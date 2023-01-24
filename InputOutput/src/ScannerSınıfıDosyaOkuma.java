import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerSýnýfýDosyaOkuma {

	public static void main(String[] args) {
		
		
		File f = new File("C:\\Users\\ÖMER\\eclipse-workspace\\InputOutput\\diller.txt");
		
		try {
			Scanner s = new Scanner (f);
			while (s.hasNextLine()) {
				String veri = s.nextLine();
				System.out.println(veri);
				
						
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("Bir hata oluþtu");
		}
		

	}

}
