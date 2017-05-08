package day1_1;
import java.util.*;
public class tls {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	//up casting
	System.out.println("Enter Details");
	person p=new trainer(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
	System.out.println("P.Show Details Before");
	p.showDetails();
	System.out.println("P.Show Details After");
//down casting
	trainer t = (trainer) p;
	t.TrainerKaMethod();
	
}
}

