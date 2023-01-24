
public class Dizii {

	public static void main(String[] args) {
		
		String a = new String ("ÖmerSungur");
		
		System.out.println(a);
		System.out.println("Girilen kelimenin uzunluðu: " + a.length());
		System.out.println("0.indeks: " + a.charAt(0)); //charAt() ile kelimenin hangi indisinde hangi harf olduðunu yazdýrýyoruz.
		System.out.println(a.startsWith("Ö")); //Stringin neyle baþladýðýný kontrol eder (True,False döner).
		System.out.println(a.endsWith("s"));
		System.out.println(a.indexOf("m")); //Baþtan baþlayarak m harfinin kaçýncý indiste olduðunu yazdýrýr.
		System.out.println(a.lastIndexOf("r")); //Sondan baþlayarak r harfinin kaçýncý indiste olduðunu yazdýrýr.
		System.out.println(a.toLowerCase()); //Bütün harfleri küçüðe çevirip tekrar yazdýrýr.
		System.out.println(a.toUpperCase());//Bütün harfleri büyüðe çevirip tekrar yazdýrýr.
		
		
		String a1 = "123";
		Integer b = Integer.parseInt(a1);
		System.out.println(b + 5);
		
		int c = 587;
		String d = String.valueOf(c);
		System.out.println(d + 5);
		System.out.println(a.concat(a1)); // concat ifadesi + operatörü gibi 2 String'i birleþtirir.
		
		

	}

}
