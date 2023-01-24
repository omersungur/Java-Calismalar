import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {

	public static void main(String[] args) {
		
		try (ObjectInputStream in = new ObjectInputStream (new FileInputStream("sogrenci.bin"))) {
			
			Serializationn ogrencio1 = (Serializationn) in.readObject(); // Obje düzenlemesi yaptýk
			Serializationn ogrencio2 = (Serializationn) in.readObject();
			
			System.out.println("----------------------");
			System.out.println(ogrencio1);
			System.out.println("----------------------");
			System.out.println(ogrencio2);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Dosya bulunamadï¿½...");
		} catch (IOException e) {
			
			System.out.println("Dosya aï¿½ï¿½lï¿½rken IOException oluï¿½tu...");
		} catch (ClassNotFoundException e) {
			
			System.out.println("Sï¿½nï¿½f bulunamadï¿½...");
		}

	}

}
