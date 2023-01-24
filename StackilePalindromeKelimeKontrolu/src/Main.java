import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static boolean isPalindrome (String cumle, Stack <Character> stack) {
		
		for (int i = (cumle.length() / 2) + 1; i < cumle.length(); i++) {
			if (cumle.charAt(i) != stack.pop()) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Cümle Giriniz: ");
		String cumle = s.nextLine();
		
		Stack <Character> stack= new Stack<>();
		
		
		for (int i = 0; i < cumle.length() / 2; i++) {
			stack.push(cumle.charAt(i));
			
			if (isPalindrome(cumle, stack)) {
				System.out.println("Girilen cümle palindromdur.");
				break;
				
			}
			else {
				System.out.println("Girilen cümle palindrom deðildir.");
				break;
			}
		}
	}

}
