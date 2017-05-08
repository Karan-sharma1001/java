package Assign_7;

import java.util.Comparator;

//public class Student4 implements Comparable<Student4>
public class Student4 implements Comparator

{
	private int rollNo;
	private String name;
	public Student4(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return " => rollNo=" + rollNo + ", name=" + name + "<=";
	}
		

/*	public int compareTo(Student4 o) {
String a=this.name;
		Student4 x=(Student4) o;
		if(a.equals(x.name))
		return 1;
		else 
		return 0;
	}*/

	public int compare(Object o1, Object o2) {
		Student4 s1=(Student4)o1;  
		Student4 s2=(Student4)o2;  
		  
		if(s1.name.equals(s2.name))  
		return 0;  
		 else  
		return -1;  
	
	}
	
	
}
