
public class Dizii {

	public static void main(String[] args) {
		
		String a = new String ("�merSungur");
		
		System.out.println(a);
		System.out.println("Girilen kelimenin uzunlu�u: " + a.length());
		System.out.println("0.indeks: " + a.charAt(0)); //charAt() ile kelimenin hangi indisinde hangi harf oldu�unu yazd�r�yoruz.
		System.out.println(a.startsWith("�")); //Stringin neyle ba�lad���n� kontrol eder (True,False d�ner).
		System.out.println(a.endsWith("s"));
		System.out.println(a.indexOf("m")); //Ba�tan ba�layarak m harfinin ka��nc� indiste oldu�unu yazd�r�r.
		System.out.println(a.lastIndexOf("r")); //Sondan ba�layarak r harfinin ka��nc� indiste oldu�unu yazd�r�r.
		System.out.println(a.toLowerCase()); //B�t�n harfleri k����e �evirip tekrar yazd�r�r.
		System.out.println(a.toUpperCase());//B�t�n harfleri b�y��e �evirip tekrar yazd�r�r.
		
		
		String a1 = "123";
		Integer b = Integer.parseInt(a1);
		System.out.println(b + 5);
		
		int c = 587;
		String d = String.valueOf(c);
		System.out.println(d + 5);
		System.out.println(a.concat(a1)); // concat ifadesi + operat�r� gibi 2 String'i birle�tirir.
		
		

	}

}
