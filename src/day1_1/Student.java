package day1_1;

public class Student {
		private int rollno;
		private String name;
		//Default constructor
		public Student()
		{
			System.out.println("In student default constructor");
		}
		public Student(int roll, String nm) {
			System.out.println("In student Parameterized constructor");
			rollno=roll;
			name=nm;
			
		}
		int getRollno()
		{
			return rollno;
		}
		String getName()
		{
			return name;
		}
		public void showStud(){
			System.out.println("Roll no is "+rollno+"\nName is "+name);
		}
		
}
