import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {

	public static void main(String[] args) {
		
		try (ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("sogrenci.bin"))) {
			
			Serializationn ogrenci1 = new Serializationn("�merS", 599, "Bilgisayar M�hendisli�i");
			Serializationn ogrenci2 = new Serializationn("AhmetA", 550, "Finansal Matematik");
			
			out.writeObject(ogrenci1);
			out.writeObject(ogrenci2);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Doysa bulunamad�...");
		} catch (IOException e) {
			
			System.out.println("Dosya a��l�rken IOException olu�tu...");
		}

		
		
	}

}
