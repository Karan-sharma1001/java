package test;

public class Student {
	private int age;
	private String name;
	private int previousMarks;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPreviousMarks() {
		return previousMarks;
	}
	public void setPreviousMarks(int previousMarks) {
		this.previousMarks = previousMarks;
	}
	public Student() {
	}
	public Student(int age, String name, int previousMarks) {
		super();
		this.age = age;
		this.name = name;
		this.previousMarks = previousMarks;
		}



}
