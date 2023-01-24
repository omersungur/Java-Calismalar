package GenericS�n�flar;

public class Main {

	public static void main(String[] args) {
		
		Character [] char_dizi = {'J','A','V','A'}; // Wrapper class olarak tan�mlanmak zorunda.
		String [] string_dizi = {"Java","Phyton","C#"};
		Integer [] integer_dizi = {1,2,3,4,5,6};
		
		Ogrenci [] ogrenci_dizi = {new Ogrenci("�mer"), new Ogrenci("Ahmet"), new Ogrenci("Mehmet")};
		
		YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>(); // sa� taraftaki <> simgesinin i�i bo�ta b�rak�labilir hata vermez.
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
