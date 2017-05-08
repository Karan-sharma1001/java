package com.application;
import java.util.Scanner;

import com.Techm.*;
public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		Employee e2=new Employee();
		System.out.println("E1 "+e1);
		System.out.println("E2 "+e2);
		System.out.println("Enter Emp name");	
		e1.setEmpName(sc.next());
		System.out.println("Enter Emp no");	
			e1.setEmpNo(sc.nextInt());
			System.out.println("Enter Emp sal");	
				e1.setEmpSal(sc.nextInt());
				System.out.println("Enter Emp name");	
				e2.setEmpName(sc.next());
				System.out.println("Enter Emp no");	
				e2.setEmpNo(sc.nextInt());
				System.out.println("Enter Emp sal");	
				e2.setEmpSal(sc.nextInt());
			System.out.println(e1);
			System.out.println(e2);
			
		
	}

}
