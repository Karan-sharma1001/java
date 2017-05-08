import java.util.Scanner;


public class FlashCardsData implements CardSearchable {
	private FlashCard[ ] a ;
	int z=0;
	Scanner sc= new Scanner(System.in);
	@Override
	public Card searchCard(String sub) throws CardNotFoundException{
		for (int i = 0; i < a.length; i++) {
			if(this.a[i].getSubject().equals(sub))
                           return this.a[i];
		
		}
	//	return null;
		
		throw new CardNotFoundException();
	}
	public void Display() {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public FlashCardsData() {
		super();
		System.out.println("Enter the no. of array you wnt to create");
		a=new FlashCard[sc.nextInt()];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter values for flashcard "+(i+1));
			System.out.println("Subject, Question, Answer");
			a[i]=new FlashCard(sc.next(), sc.next(), sc.next());
			z=i;
			
		}
		System.out.println("All "+(z+1)+" Valus are stored in array");
	}

}
