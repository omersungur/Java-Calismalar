
public class OznelExceptionClass extends ArithmeticException {

	public OznelExceptionClass(String message) {
		
		super(message);
	}

	@Override
	public void printStackTrace() {
		
		System.out.println("Bu bir invalid age hatasýdýr...");
	}

}
