import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Mp3Copyy {

	private static ArrayList <Integer> icerik = new ArrayList<Integer>();
	
	public static void dosyaOku () {
		
		try {
			
			FileInputStream in = new FileInputStream("musicc.mp3");
			
			int oku;
			
			while ((oku = in.read()) != -1) {
				
				icerik.add(oku);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void kopyalama (String dosyaAd) {
		
		try {
			
			FileOutputStream yaz = new FileOutputStream(dosyaAd);
			
			for (int deger: icerik) {
				yaz.write(deger);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		
		dosyaOku();
		
		long baslangic = System.currentTimeMillis();
		
		kopyalama("kopya1.mp3");
		kopyalama("kopya2.mp3");
		kopyalama("kopya3.mp3");
		
		long bitis = System.currentTimeMillis();
		
		System.out.println("Kopyalanýrken harcanan süre: " + ((bitis-baslangic)/1000) + " saniye sürdü.");
	}

}
