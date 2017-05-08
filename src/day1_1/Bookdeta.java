package day1_1;

import java.util.Scanner;
public class Bookdeta {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		book b1= new book();
		System.out.println("Enter Book No");
		 int bookNo=n.nextInt();
		 System.out.println("Enter Title");
		 String title=n.next();
		 System.out.println("Enter author");
		 String author=n.next();
		 System.out.println("Enter Price");
		 float price=n.nextFloat();
		 b1.setAuthor(author);
		 b1.setBookNo(bookNo);
		 b1.setPrice(price);
		 b1.setTitle(title);
		 b1.showBook();
	}

}
