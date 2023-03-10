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
	    
	    Sadece List Interface'i implemente eden classlarda kullanılır.
	    next() ve previous() metodu vardır. 
	    Ekstradan add() metodu bulunur.
	    
	    Iterator: 
	    
	    Set , Queue ve List Interface'i implement'e eden classlarda kullanılabilir.
	    previous() metodu yoktur.
	    
	    */
		
		
		Set<String> set =  new HashSet<String>();
        List <String> list =  new ArrayList<>();
        
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        
        Iterator <String> ite1 = set.iterator(); // Bu yapılarda geri gidilme özelliği yoktur. Yani Bir listeyi bir kere yazdırabiliriz.
        Iterator <String> ite2 = list.iterator();
        
        ListIterator <String> lite1 = list.listIterator(); // Bu yapıda ileri geri gidilebilir. Yani listeyi ileri geri alarak defalarca yazdırabiliriz.
        
        while (lite1.hasNext()) {
        	System.out.println(lite1.next());
        }
	}

}
