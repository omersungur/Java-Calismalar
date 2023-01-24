import java.util.ArrayList;
import java.util.List;

public class LambdaIfadeSiralama {

	public static void main(String[] args) {

		List <String> listt = new ArrayList<>();
		
		listt.add("Omer");
		listt.add("Amer");
		listt.add("Pmer");
		
		System.out.println(listt);
		
		listt.sort((isim1,isim2) -> isim1.compareTo(isim2)); // B�y�kten k����e i�in > ((isim1,isim2) -> isim2.compareTo(isim1));
		// ya da Collections.reverse(listt); diyerek b�y�kten k����e s�ralayabiliriz.
		
		System.out.println(listt);

	}

}
