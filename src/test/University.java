package test;

import java.util.Scanner;

public class University {
	static int count;
	private static professor professor;
	Exam exam;

	boolean studentVerificationProcess(Student student){
		//Validator v;
		if (Validator.validateStudent(student) )
			return true;
		else
			return false;
	}


	void writeExamGetResult(Student s,Exam exam){
		System.out.println(s.getName()+" your % is "+exam.getMarks());
	}

	void studentAdmission(Student student , Course course){
		count++;
		System.out.println("Your Student id = : "+count);
		System.out.println(student.getName()+" register for "+course.getName());


	}

	void studentCertificationProcess(Student student,Course course){
		System.out.println(student.getName()+" you are "+course.getName()+" Professional Certified..");

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Declaration
		University u1=new University();
		Student s1=new Student();
		professor  p1=new professor();
		Course c1=new Course();
		Exam e1=new Exam(10,"java",90);

		//Values input
		System.out.println("Enter Name of student");
		s1.setName(sc.next());
		System.out.println("Enter age of student");
		s1.setAge(sc.nextInt());	
		System.out.println("Enter Prev marks of student");
		s1.setPreviousMarks(sc.nextInt());
		System.out.println("enter course Id");
		c1.setId(sc.nextInt());
		System.out.println("enter course Name");
		c1.setName(sc.next());
		System.out.println("enter course Duration");
		c1.setDuration(sc.nextInt());
		System.out.println("Enter Professor Name");
		p1.setName(sc.next());
		p1.setStudent(s1);

		//Process start
		u1.studentVerificationProcess(s1);
		u1.studentAdmission(s1, c1);
		p1.teaches(c1);
		p1.conductingExam(e1);
		System.out.println("Marks----->"+p1.evaluatingPaper(e1));
		if(e1.getMarks()>70){
			u1.writeExamGetResult(s1, e1);
			u1.studentCertificationProcess(s1, c1);
		}
		else
		{
			System.out.println(s1.getName()+" your % marks is 70 below" );

		}

	}


}
