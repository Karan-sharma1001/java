package test;

public class professor {
	private String name;
	private Student student;
	
	void teaches(Course course){
		System.out.println(name+" is teaching "+course.getName()+"  to "+student.getName());
	}
	void conductingExam(Exam exam){
		System.out.println(name+" is Conducting "+exam.getName()+"   Exam to "+student.getName());
	}
	
	public professor() {

	}
	
	public professor(String name, Student student) {
		super();
		this.name = name;
		this.student = student;
		
	}
	
	int evaluatingPaper(Exam exam){
		System.out.println(this.getName()+" is evaluating "+this.getStudent().getName()+exam.getName()+" paper");
		exam.setMarks(90);
		return exam.getMarks();
		
	}
	
	public Student getStudent() {
		return student;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}

}
