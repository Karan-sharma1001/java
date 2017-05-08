package Assign_7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student1{
	private HashMap<String, String> empNames=new HashMap<String, String>();// – HashMap having rollno as key  and name as value. Key and value are of type String
	Student s1;
	Scanner sc=new Scanner(System.in);
	public void setNames( ) {
		//– method to set names in HashMap.
		System.out.println("enter how many entries you want to create");
		int a=sc.nextInt();
		for (int i = 0; i < a; i++) {
			
		

		System.out.println("Enter Rollno,Name");
		empNames.put(sc.next(), sc.next());
		System.out.println("Value inserted for "+(i+1)+"th value");
		}
	}
	
	
	
	public void printNames( ){
		// – method to print all names
		System.out.println(empNames);
	}
	
	
	
	
	
	public void getName( String key )// – method to print value of a given key
	{
		System.out.println(empNames.containsKey(key));
		}
	
	
	public void printNamesKeySet( ) //– method to print all values by using keyset  of HashMap.
	{
		System.out.println(empNames.keySet());
		Set s1=empNames.keySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
			int n=(Integer)itr.next();
			System.out.println(empNames.get(n));
		}
	}
	
	
	
	
	public void printSize( )// – method to print size of HashMap
	{
		System.out.println(empNames.size());
	}
	
	public void remove( String key )// – method to remove a value of a given key
	{
		System.out.println(empNames.remove(key));
	}

}
