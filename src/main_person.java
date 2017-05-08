import java.util.Scanner;
public class main_person {
public main_person() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter fname, lname,address,num of enp, experience ");
	trainer t=new trainer(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
	t.showDetails();
	
	
}
}
