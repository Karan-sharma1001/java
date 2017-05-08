package day1_1;
import java.util.Scanner;
public class chk {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		book b1[ ]= new book[3];

		for (int j = 0; j < b1.length; j++) {
			
			
			System.out.println("Enter value for  "+j+" array");
		b1[j]=new book();
		System.out.println("Enter Book No");
		 int bookNo=n.nextInt();
		 System.out.println("Enter Title");
		 String title=n.next();
		 System.out.println("Enter author");
		 String author=n.next();
		 System.out.println("Enter Price");
		 float price=n.nextFloat();
		
		 b1[j].setAuthor(author);
		 b1[j].setBookNo(bookNo);
		 b1[j].setPrice(price);
		 b1[j].setTitle(title);
		 b1[j].showBook();
		 System.out.println(b1.toString());
		 System.out.println(book.getBookCount());
	}
		int[] a=new int[3];
		System.out.println("Enter number to be search");
		
		int z=n.nextInt();
		for (int i = 0; i < a.length; i++) {
			a[i]=b1[i].getBookNo();
			
		}
		int b=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==z)
			{
				System.out.println("Book found  having book number "+z);
				b=1;
				break;
			}
		}
	      	if ( b== 0) {
				System.out.println("Book not found");
		}
	      	
	      	Engineeringbook f=new Engineeringbook("physics");
	      	System.out.println(f.getCategory());
	      	
	}
}