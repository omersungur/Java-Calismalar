import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OyunKayit {

	public static void oyunKaydet (Kart [] [] kartlar)  {
		
		try (ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("kayit.bin"))) {
			
			System.out.println("Oyun Kaydediliyor...");
			out.writeObject(kartlar);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Kart [] [] kayýttanAl () {
		
		try (ObjectInputStream in = new ObjectInputStream (new FileInputStream("kayit.bin"))) {
			
			Kart [] [] cikti = (Kart[][]) in.readObject();
			return cikti;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
}
