
public class CardNotFoundException extends Exception {
public CardNotFoundException(){
	System.out.println("The card you are looking for is not available");
}

@Override
public String toString() {
	return "CardNotFoundException Called";
}

}
