package test;

public class Registrar {
	public static boolean  registerStudent(Student s){
		System.out.println(s.getName()+" Applied for University");
		System.out.println("Register has sent your details to Validator... plz wait");
		System.out.println(s.getName()+"  you are registered successfully ,"+" Welcome to our University");
		return true;
	}
}
