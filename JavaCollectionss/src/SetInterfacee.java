import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfacee {

	public static void main(String[] args) {
		
		/*
	    Set Interface ----> HashSet,LinkedHashSet, TreeSet

	    Set Interface ile List Interface’in farký
	    List interface’i implemente eden classlar bir elementten birden fazla depolayabilirken,  
	    Set interface’i implemente eden classlar bir elementten sadece bir tane depolarlar.

	    HashSet Sýnýfý

	    HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

	    1.HashSet elementleri "hashing" yani hash table  mekanizmasýna uygun bir biçimde depolarlar
	    (Her element belli bir key'e göre depolanýr.)

	    2.HashSet bir element'i sadece bir defa depolar.(Set Interface)

	    3. Elementlerin ekleme sýrasýna göre depolamaz.

	    LinkedHashSet Sýnýfý

	    LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

	    1. LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davranýr.

	    2. HashSette olduðu gibi bir elementi sadece bir defa depolar.(Set Interface)

	    3. Elementleri ekleme sýrasýna göre depolar.


	    TreeSet Sýnýfý

	    TreeSet sýnýfý NavigableSet inteface'ini implemente eder ve AbstractSet sýnýfýndan miras alýr. 
	    NavigableSet interface'i de SortedSet interfaceinden miras alýr. 

	    1. Elementleri depolamak için Tree yani Aðaç yapýsýný kullanýr.

	    2. Elementleri alfabetik olarak sýralarlar.



	    HashSet vs LinkedHashSet vs TreeSet

	    HashSet, Hash Table mekanizmasýný uyguladýðý için elementler sýralý deðildir. Ekleme,Çýkarma ve
	    Arama metodlarý sabit zamanda( Time Complexity : O(1) ) çalýþýr. 

	    TreeSet, elementleri tree yapýsýna yani aðaç yapýsýna uygun depolar. Ekleme,Çýkarma ve 
	    Arama metodlarý O(log(n)) complexitysi ile çalýþýr.

	    LinkedHashSet sýnýfý hashtable ile linked list yapýsýný kullanarak elementleri depolar.Bu yüzden,
	    elemetler ekleme sýrasýna göre depolanýr. Ekleme,Çýkarma ve Arama metodlarý 
	    sabit zamanda( Time Complexity : O(1) ) çalýþýr. 
		*/
		
		Set <String> set1 = new HashSet<String>();
		Set <String> set2 = new LinkedHashSet<String>();
		Set <String> set3 = new TreeSet<String>();
		
		//HashSet
		set1.add("Java");
		set1.add("Python");
		set1.add("C++");
		set1.add("Javascript");
		set1.add("Php");
		
		//LinkedHashSet (Ekleme Sýrasýna Göre Bastýrýr)
		set2.add("Java");
		set2.add("Python");
		set2.add("C++");
		set2.add("Javascript");
		set2.add("Php");
		
		//TreeSet (Alfabetik Olarak Bastýrýr)
		set3.add("Java");
		set3.add("Python");
		set3.add("C++");
		set3.add("Javascript");
		set3.add("Php");
		
		//set3.add("Php"); > TreeSet te ayný bir elemaný eklemeye çalýþtýðýmýzda eklemiyor.
		
		System.out.println("------------------------------");
		
		for (String h: set1) {
			System.out.println(h);
		}
		
		System.out.println("------------------------------");
		
		for (String l: set2) {
			System.out.println(l);
		}
		System.out.println("------------------------------");
		
		for (String t: set3) {
			System.out.println(t);
		}
		System.out.println("------------------------------");
		
		System.out.println(set1.contains("Java")); // Ýçerik kontrolü yapar ve true or false deðeri döndürür.
		System.out.println(set1.isEmpty()); // Eleman varsa false yoksa true dönderen method.
		set1.remove("Java"); // Eleman çýkartma methodu.
		
		System.out.println("------------------------------");
		
		Set<String> sett1 = new HashSet<String>();	
		Set <String> sett2 = new HashSet<String>();
		
		sett1.add("Java");
		sett1.add("C++");
		sett1.add("Python");
		sett1.add("Javascript");
		sett1.add("Php");
		
		sett2.add("Go");
		sett2.add("Java");
		sett2.add("CSS");
		
		Set <String> farkKu = new HashSet<String>(sett2); // set2 constructor ýný kullarak farkKu 'yu set2 elemanlarýna eþitlemiþ olduk.
		
		System.out.println(farkKu.removeAll(sett1)); // Ýki set arasýnda fark var mý diye kontrol ettiriyoruz. Varsa true dönüyor ve ortak olanlarý çýkarýyor.
		System.out.println(farkKu);
		
		System.out.println("------------------------------");
		
		Set <String> kesisim = new HashSet<String>(sett2);
		
		System.out.println(kesisim.retainAll(sett1)); // Ýki set arasýnda ortak eleman var mý diye bakýyor. Varsa ortak elemaný kesisim e atýyor.
		System.out.println(kesisim);
		
		
		//Sýralý deðerle çalýþacaksak TreeSet, karýþýk deðerler ekleyeceksek HashSet daha performanslý çalýþýr.

		System.out.println(set3); // Bu þekilde de yazdýrabiliriz.
	}

}
