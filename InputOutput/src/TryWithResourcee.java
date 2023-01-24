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
					System.out.println("Programdan çýkýlýyor...");
					System.out.println("Dosyayý kontrol ediniz...");
					break;
					
				}
				
				writerr.write(dil + "\n");
			}
			
		} catch (IOException e) {
			
			System.out.println("Dosya oluþturulurken bir hata oluþtu...");
		}
			
		
		
		
	}

}
