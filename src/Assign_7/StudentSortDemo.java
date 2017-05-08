package Assign_7;
import java.util.*;

public class StudentSortDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Student4> s=new ArrayList<Student4>(5);
	System.out.println("Insertion process started");
	for (int i = 0; i < 5; i++)
	{
		System.out.println("Add data Roll no int and Name string for :"+i);
		s.add(new Student4(sc.nextInt(), sc.next()));
	}
	System.out.println("Insertion process ended");
	System.out.println("  ");
	System.out.println("ArrayList"+s);
	System.out.println("  ");
	
	//Collections.sort(s);  
	for(Student4 k:s){  
	System.out.println(k.getRollNo()+" "+k.getName());  
	} 
	/*
	Student s=new Student();
	s.setNames();
	System.out.println("Enter index to search");
	s.searchName(sc.nextInt());
	System.out.println("Enter iName to search");
	s.searchName(sc.next());
	System.out.println("Name to Remove");
	s.removeName(sc.next());
	*/
}
}