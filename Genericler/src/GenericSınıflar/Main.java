package GenericSýnýflar;

public class Main {

	public static void main(String[] args) {
		
		Character [] char_dizi = {'J','A','V','A'}; // Wrapper class olarak tanýmlanmak zorunda.
		String [] string_dizi = {"Java","Phyton","C#"};
		Integer [] integer_dizi = {1,2,3,4,5,6};
		
		Ogrenci [] ogrenci_dizi = {new Ogrenci("Ömer"), new Ogrenci("Ahmet"), new Ogrenci("Mehmet")};
		
		YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>(); // sað taraftaki <> simgesinin içi boþta býrakýlabilir hata vermez.
		YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
		YazdirmaSinifi<Integer> yazdir_integer = new YazdirmaSinifi<Integer>();
		YazdirmaSinifi<Ogrenci> ogrenci_yazdir = new YazdirmaSinifi<Ogrenci>();
		
		yazdir_char.yazdirma(char_dizi);
		System.out.println();
		yazdir_string.yazdirma(string_dizi);
		System.out.println();
		yazdir_integer.yazdirma(integer_dizi);
		System.out.println();
		ogrenci_yazdir.yazdirma(ogrenci_dizi);
		
		
	}

}
