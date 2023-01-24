import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourcee {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String dil;
		
		try (FileWriter writerr = new FileWriter ("diller.txt")) {
				
			while (true) {
				
				System.out.print("Bir dil giriniz: ");
				dil = scan.nextLine();
				
				if (dil.equals("-1")) {
					System.out.println("Programdan ��k�l�yor...");
					System.out.println("Dosyay� kontrol ediniz...");
					break;
					
				}
				
				writerr.write(dil + "\n");
			}
			
		} catch (IOException e) {
			
			System.out.println("Dosya olu�turulurken bir hata olu�tu...");
		}
			
		
		
		
	}

}
