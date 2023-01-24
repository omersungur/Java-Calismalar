import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HarfFrekansiBulma {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("C�mle giriniz: ");
		String c�mle = s.nextLine();
		
		Map <Character, Integer> frekans = new TreeMap<>();
		
		for (int i = 0; i < c�mle.length(); i++) {
			char c = c�mle.charAt(i);
			
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
