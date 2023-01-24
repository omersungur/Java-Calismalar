
public class asdsad {

	public static void main(String[] args) {
		
		System.out.println(funy(4, 3));

	}
	
	static int funy (int x, int y) {
		
		if (x==0) 
		return y;
		
		else return funy(x-1, x+y);
	}
	
	
	

}
