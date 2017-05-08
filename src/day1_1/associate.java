package day1_1;

import java.util.Date;



public class associate {
	private int id;
	private String name;
	private Date joinDate;
	
	public associate(int id, String name, Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getJoinDate() {
		return joinDate;
	}
	public void showData() {
		System.out.println("ID :"+this.id);
		System.out.println("Name "+this.name);
		System.out.println("Join Date :"+this.joinDate);
		
		
	}

	@Override
	public String toString() {
		System.out.println("In my toString()");
		return "\nid=  " + id + ",\nname=  " + name + ",\njoinDate=  "
				+ joinDate;
	}
	
}
