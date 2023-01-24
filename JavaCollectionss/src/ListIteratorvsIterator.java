import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListIteratorvsIterator {

	public static void main(String[] args) {
		
		/*
	    ListIterator
	    
	    Sadece List Interface'i implemente eden classlarda kullanýlýr.
	    next() ve previous() metodu vardýr. 
	    Ekstradan add() metodu bulunur.
	    
	    Iterator: 
	    
	    Set , Queue ve List Interface'i implement'e eden classlarda kullanýlabilir.
	    previous() metodu yoktur.
	    
	    */
		
		
		Set<String> set =  new HashSet<String>();
        List <String> list =  new ArrayList<>();
        
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        
        Iterator <String> ite1 = set.iterator(); // Bu yapýlarda geri gidilme özelliði yoktur. Yani Bir listeyi bir kere yazdýrabiliriz.
        Iterator <String> ite2 = list.iterator();
        
        ListIterator <String> lite1 = list.listIterator(); // Bu yapýda ileri geri gidilebilir. Yani listeyi ileri geri alarak defalarca yazdýrabiliriz.
        
        while (lite1.hasNext()) {
        	System.out.println(lite1.next());
        }
	}

}
