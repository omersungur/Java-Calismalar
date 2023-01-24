
public class RecursiveFonksiyon {

	static int f(int x) {
		if (x==10) {
			return 10;
		}
		
		return x + f(x+1);
	}
	public static void main(String[] args) {
		
		System.out.println(f(0)); //1'den 10'a kadar olan sayýlarýn toplamý
	}
}
