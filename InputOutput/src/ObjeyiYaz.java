import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {

	public static void main(String[] args) {
		
		try (ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("sogrenci.bin"))) {
			
			Serializationn ogrenci1 = new Serializationn("ÖmerS", 599, "Bilgisayar Mühendisliði");
			Serializationn ogrenci2 = new Serializationn("AhmetA", 550, "Finansal Matematik");
			
			out.writeObject(ogrenci1);
			out.writeObject(ogrenci2);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Doysa bulunamadý...");
		} catch (IOException e) {
			
			System.out.println("Dosya açýlýrken IOException oluþtu...");
		}

		
		
	}

}
