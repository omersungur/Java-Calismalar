import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfacee {

	public static void main(String[] args) {
		
		/*
	    Set Interface ----> HashSet,LinkedHashSet, TreeSet

	    Set Interface ile List Interface�in fark�
	    List interface�i implemente eden classlar bir elementten birden fazla depolayabilirken,  
	    Set interface�i implemente eden classlar bir elementten sadece bir tane depolarlar.

	    HashSet S�n�f�

	    HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

	    1.HashSet elementleri "hashing" yani hash table  mekanizmas�na uygun bir bi�imde depolarlar
	    (Her element belli bir key'e g�re depolan�r.)

	    2.HashSet bir element'i sadece bir defa depolar.(Set Interface)

	    3. Elementlerin ekleme s�ras�na g�re depolamaz.

	    LinkedHashSet S�n�f�

	    LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

	    1. LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davran�r.

	    2. HashSette oldu�u gibi bir elementi sadece bir defa depolar.(Set Interface)

	    3. Elementleri ekleme s�ras�na g�re depolar.


	    TreeSet S�n�f�

	    TreeSet s�n�f� NavigableSet inteface'ini implemente eder ve AbstractSet s�n�f�ndan miras al�r. 
	    NavigableSet interface'i de SortedSet interfaceinden miras al�r. 

	    1. Elementleri depolamak i�in Tree yani A�a� yap�s�n� kullan�r.

	    2. Elementleri alfabetik olarak s�ralarlar.



	    HashSet vs LinkedHashSet vs TreeSet

	    HashSet, Hash Table mekanizmas�n� uygulad��� i�in elementler s�ral� de�ildir. Ekleme,��karma ve
	    Arama metodlar� sabit zamanda( Time Complexity : O(1) ) �al���r. 

	    TreeSet, elementleri tree yap�s�na yani a�a� yap�s�na uygun depolar. Ekleme,��karma ve 
	    Arama metodlar� O(log(n)) complexitysi ile �al���r.

	    LinkedHashSet s�n�f� hashtable ile linked list yap�s�n� kullanarak elementleri depolar.Bu y�zden,
	    elemetler ekleme s�ras�na g�re depolan�r. Ekleme,��karma ve Arama metodlar� 
	    sabit zamanda( Time Complexity : O(1) ) �al���r. 
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
		
		//LinkedHashSet (Ekleme S�ras�na G�re Bast�r�r)
		set2.add("Java");
		set2.add("Python");
		set2.add("C++");
		set2.add("Javascript");
		set2.add("Php");
		
		//TreeSet (Alfabetik Olarak Bast�r�r)
		set3.add("Java");
		set3.add("Python");
		set3.add("C++");
		set3.add("Javascript");
		set3.add("Php");
		
		//set3.add("Php"); > TreeSet te ayn� bir eleman� eklemeye �al��t���m�zda eklemiyor.
		
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
		
		System.out.println(set1.contains("Java")); // ��erik kontrol� yapar ve true or false de�eri d�nd�r�r.
		System.out.println(set1.isEmpty()); // Eleman varsa false yoksa true d�nderen method.
		set1.remove("Java"); // Eleman ��kartma methodu.
		
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
		
		Set <String> farkKu = new HashSet<String>(sett2); // set2 constructor �n� kullarak farkKu 'yu set2 elemanlar�na e�itlemi� olduk.
		
		System.out.println(farkKu.removeAll(sett1)); // �ki set aras�nda fark var m� diye kontrol ettiriyoruz. Varsa true d�n�yor ve ortak olanlar� ��kar�yor.
		System.out.println(farkKu);
		
		System.out.println("------------------------------");
		
		Set <String> kesisim = new HashSet<String>(sett2);
		
		System.out.println(kesisim.retainAll(sett1)); // �ki set aras�nda ortak eleman var m� diye bak�yor. Varsa ortak eleman� kesisim e at�yor.
		System.out.println(kesisim);
		
		
		//S�ral� de�erle �al��acaksak TreeSet, kar���k de�erler ekleyeceksek HashSet daha performansl� �al���r.

		System.out.println(set3); // Bu �ekilde de yazd�rabiliriz.
	}

}
