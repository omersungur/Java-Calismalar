import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HarfFrekansiBulma {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Cümle giriniz: ");
		String cümle = s.nextLine();
		
		Map <Character, Integer> frekans = new TreeMap<>();
		
		for (int i = 0; i < cümle.length(); i++) {
			char c = cümle.charAt(i);
			
			if (frekans.containsKey(c)) {
				frekans.replace(c, frekans.get(c)+1);
			}
			
			else {
				frekans.put(c,1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry: frekans.entrySet()) {
			System.out.println(entry);
		}

	}

}
