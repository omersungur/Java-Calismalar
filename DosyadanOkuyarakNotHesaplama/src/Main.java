import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static String harfnotuHesapla (String isim, int vize1,int vize2, int finalnot) {
		
		String cikti = "";
		
		double toplamNot = (vize1 * (30 / 100) + vize2 * (30/100) + finalnot * (40/100));
		
		if (toplamNot >= 90) {
			cikti = isim + " bu dersten AA aldý";
		}
		
		if (toplamNot >= 85) {
			cikti = isim + " bu dersten BA aldý";
		}
		
		if (toplamNot >= 80) {
			cikti = isim + " bu dersten BB aldý";
		}
		
		if (toplamNot >= 75) {
			cikti = isim + " bu dersten CB aldý";
		}
		
		if (toplamNot >= 70) {
			cikti = isim + " bu dersten CC aldý";
		}
		
		if (toplamNot >= 65) {
			cikti = isim + " bu dersten DC aldý";
		}
		
		if (toplamNot >= 60) {
			cikti = isim + " bu dersten DD aldý";
		}
		
		if (toplamNot >= 55) {
			cikti = isim + " bu dersten FD aldý";
		}
		
		else {
			cikti = isim + " bu dersten FF aldý";
		}
		
		return cikti;
	}
	public static void main(String[] args) {
		
		
		try (Scanner s = new Scanner(new FileReader ("NotDosyasý.txt"));
			 FileWriter writerr = new FileWriter("harfNotlarý.txt")) {
			
			while (s.hasNextLine()) { // Okunacak satýr kaldý mý diye kontrol eder.
				String ogrenciBilgileri = s.nextLine();
				
				String [] ogrenciArray = ogrenciBilgileri.split(",");
				
				int vize1 = Integer.valueOf(ogrenciArray[1]); // Notlar string tipinde olduðu için cast iþlemi yaptýk.
				int vize2 = Integer.valueOf(ogrenciArray[2]);
				int finalnot = Integer.valueOf(ogrenciArray[3]);
				
				String ciktii = harfnotuHesapla(ogrenciArray [0], vize1, vize2, finalnot);
				
				writerr.write(ciktii + "\n");
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}

	}

}
