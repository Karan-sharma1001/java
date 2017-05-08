import java.util.Scanner;


public class FlashCardTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FlashCardsData a=new FlashCardsData();
		DisplayThread d1=new DisplayThread();
		d1.start();
		System.out.println("Enter subject to be searched");
		Card d=null;
		
		try {
			d = a.searchCard(sc.next());
			System.out.println(d);
		} catch (CardNotFoundException e) {
			System.out.println(e);
		}
		

}
}

