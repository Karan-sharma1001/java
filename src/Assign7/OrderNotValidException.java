package Assign7;

public class OrderNotValidException extends Exception {
OrderNotValidException(){
	System.out.println("Order id is not valid");
}

@Override
public String toString() {
	return "OrderNotValidException []  Order id is not valid";
}

}
