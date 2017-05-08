package day1_1;

import day1_1.person;

public class trainer extends person{
	private int num_of_skills;
	private int expInyrs;
	public trainer(String fname, String lname, String address, int num, int exp) {
		super(fname, lname, address);
		this.num_of_skills=num;
		this.expInyrs=exp;
		
	}

	public void TrainerKaMethod() {
		System.out.println("Trainer ka method");
	}
	@Override
	public void showDetails(){
		System.out.println(this.getFname());	
		System.out.println(this.getLname());
		System.out.println(this.getAddress());
		System.out.println(this.num_of_skills);
		System.out.println(this.expInyrs);
	}

	@Override
	public String toString() {
		return "trainer [num_of_skills=" + num_of_skills + ", expInyrs="
				+ expInyrs + "]";
	}
	
}
