package new_expt;

import java.util.Scanner;
import java.util.TreeMap;

public class Temp {
public static void main(String[] args) {
	TreeMap<Product, String> tm=new TreeMap<Product, String>();
	Scanner sc=new Scanner(System.in);
	Product[] p=new Product[5];
	for (int i = 0; i < p.length; i++) {

		System.out.println("Enter values for product int, String");
		p[i]=new Product(sc.nextInt(),sc.next());
		
	}
	for (int i = 0; i < p.length; i++) {
		System.out.println("Enter description of project ");
		tm.put(p[i], sc.next());
		System.out.println("tm is ");
		System.out.println(p[i]);
	}
	
}
}
