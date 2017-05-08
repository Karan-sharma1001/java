
public class ArithmeticDemo {
public static void main(String[] args) {
	ArithmeticImpl a=new ArithmeticImpl();
	System.out.println(a.subtraction(5,2));
	System.out.println(a.subtraction(5,2,1));
	System.out.println(a.subtraction(5.8,2.1));
	System.out.println(a.subtraction(5,2.4));
	System.out.println(a.subtraction(5.1f,2.1f,1.1f));
}
}
