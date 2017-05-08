package Assign_7;

import java.util.*;

public class Student {
	private ArrayList<String> names=new ArrayList<String>() ;
	Scanner sc=new Scanner(System.in);
	
	public void setNames(){
		System.out.println("How many students u want to add");
		int j=sc.nextInt();
		//– method to scan names of student and set in names arraylist
		for (int i = 0; i < j; i++) {
			
		
				System.out.println("Enter name");
				names.add(sc.next());
		}
	}
	
	public void searchName(String name)// – method to search a student by name
	{
		if (names.contains(name))
			System.out.println("found");
		else
			System.out.println("not found");
	
	}



	
	public void searchName(int index) //– method to print student name at an index
	{
		System.out.println(names.get(index));
	}
	
	
	public void printNames( )// – method to print all names using Iterator
	{
		Iterator i=names.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("In  for loop ");
		for (int j = 0; j < names.size(); j++) {
			System.out.println(names.get(j));
		}
		
		}
	
	public void removeName( String stuName )// – method to delete a name 
	{
		System.out.println(names.remove(stuName));
	}
}
