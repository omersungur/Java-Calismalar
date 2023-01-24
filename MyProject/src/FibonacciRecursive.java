
public class FibonacciRecursive {

	public static int fib (int x) {
		if (x<=2) {
			return 1;
		}
		
		return fib (x-1) + fib (x-2);
	}
	
	public static void main(String[] args) {
		System.out.println(fib(5)); 
	}

}
