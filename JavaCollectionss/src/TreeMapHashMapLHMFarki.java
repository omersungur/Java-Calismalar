import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapHashMapLHMFarki {

	public static void mapYazdir (Map <Integer,String> a) {
		
		a.put(10, "C++");
		a.put(5, "Java");
		a.put(1, "Python");
		a.put(2, "Php");
		a.put(100, "C");
		
		for (Map.Entry<Integer, String> entr: a.entrySet()) {
			
			System.out.println(entr);
		}
	}
	
	public static void main(String[] args) {
		
		Map<Integer,String> hashmap = new HashMap<>();
		Map<Integer,String> linkedhashmap = new LinkedHashMap();
		Map<Integer,String> treemap = new TreeMap<>();
		
		mapYazdir(hashmap);
		System.out.println("---------------------------");
		mapYazdir(linkedhashmap);
		System.out.println("---------------------------");
		mapYazdir(treemap);

	}

}
