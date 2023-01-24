import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDosyayaVeriYazma {

	public static void main(String[] args) {
		
		try (BufferedWriter writerr = new BufferedWriter(new FileWriter("ogrenciler.txt", true))) {
			
			writerr.write("Lionel Messi,Futbolcu\n");
			
		}
		
		catch (IOException e) {
			
		}

	}

}
