import java.util.Scanner;


public class TestEmployee {
public static void main(String[] args) {
	Employee e1=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter values for employee");
	System.out.println("Enter empbasic");
	e1.setEmpBasic(sc.nextInt());
	System.out.println("Enter empName");
	e1.setEmpName(sc.next());
	System.out.println("Enter empEmpno");
	e1.setEmpNo(sc.nextInt());
	System.out.println(e1);
}
}
