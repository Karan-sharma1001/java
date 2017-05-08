package day1_1;
import java.util.*;
public class t {
	public static void main(String[] args) {
		/*	employee e1=new employee();*/
			Scanner s=new Scanner(System.in);
			/*e1.showInfo();*/
			/*e1.setSalary(985230);
			employee e2=new employee("KARAN",501632,985000);
			e2.showInfo();
			System.out.println(e1.getEmpid());
			System.out.println(e1.name);
			System.out.println(e1.salary);*/
			System.out.println("How many employees are there");
			int num_of_emp=s.nextInt();
			employee earr[]=new employee[num_of_emp];
			
			//using setter method
			for (int i = 0; i < earr.length; i++) {
				earr[i]=new employee();
				
		System.out.println("Enter Empid for array ["+i+"]");
				earr[i].setEmpid(s.nextInt());
				System.out.println("Enter Name of employee for array ["+i+"]");
				earr[i].setName(s.next());
				System.out.println("Enter salary of employee for array ["+i+"]");
				earr[i].setSalary(s.nextInt());
				
		
			}
			for (int j = 0; j < earr.length; j++) {
				
			
			earr[j].showInfo();
			}
		}
	}


