
public class onee {

	
	public static void main(String[] args) {
		
		int a = 2;
		
		Integer b = new Integer (6);
		
		System.out.println("Fonksiyona gitmeden a de�i�keni: " + a);
		System.out.println("Fonksiyona gitmeden b de�i�keni: " + b);
		
		degistir(a);
		
		System.out.println("Fonksiyona gittikten sonra a de�i�keni: " + a);
		
		degistir(b);
		System.out.println("Fonksiyona gittikten sonra b de�i�keni: " + b);
		System.out.println("Fonksiyona gittikten sonra b de�i�keni: " + b);
		

	}
	
	public static void degistir (int y ,int a) {
		y = y+y;
		System.out.println(y);
	}
	
	public static void degistir (int x) {
		x = x+x;
	}

}
