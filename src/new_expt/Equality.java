package new_expt;

import java.util.Scanner;


public class Equality {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter values for emp: int int string");
				Employee e1=new Employee(sc.nextInt(), sc.nextInt(), sc.next());		
				System.out.println("Enter emp 2");
				Employee e2=new Employee(sc.nextInt(), sc.nextInt(), sc.next());		
			System.out.println("The two objects are : "+e1.equals(e2));
}
}
