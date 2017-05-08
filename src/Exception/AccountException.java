package Exception;

public class AccountException extends Exception {

	public AccountException(String message) {
		super(message);
		System.out.println("In para const");
		
	}

	@Override
	public String toString() {
		return "AccountException []";
	}

	public AccountException() {
		
		System.out.println("In Default const");
		
	}
	//1. toString 
	
	//2.Default constructor 
	
	//3. Para constructor taking string arg
	
	
	
	
	
	
}
