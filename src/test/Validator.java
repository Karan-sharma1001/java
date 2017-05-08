package test;

import java.util.Scanner;

public class Validator {
	public static boolean  validateStudent(Student s){
if(Registrar.registerStudent(s))
		System.out.println("Validator validating your details"+s.getName()+"..... Please wait");
		if(s.getPreviousMarks() > 60){
			Registrar.registerStudent(s);
		return true;}
		else 
			return false;
	}
}
