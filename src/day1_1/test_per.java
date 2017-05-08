package day1_1;



import java.util.Scanner;
public class test_per {
public test_per() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter fname, lname,address,num of enp, experience ");
	trainer t=new trainer(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
	System.out.println(t);
	
	
}
}
