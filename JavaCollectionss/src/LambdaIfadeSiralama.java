import java.util.ArrayList;
import java.util.List;

public class LambdaIfadeSiralama {

	public static void main(String[] args) {

		List <String> listt = new ArrayList<>();
		
		listt.add("Omer");
		listt.add("Amer");
		listt.add("Pmer");
		
		System.out.println(listt);
		
		listt.sort((isim1,isim2) -> isim1.compareTo(isim2)); // Büyükten küçüðe için > ((isim1,isim2) -> isim2.compareTo(isim1));
		// ya da Collections.reverse(listt); diyerek büyükten küçüðe sýralayabiliriz.
		
		System.out.println(listt);

	}

}
