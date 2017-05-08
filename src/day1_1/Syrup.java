package day1_1;

public class Syrup extends Medicine {

	@Override
	public String displayLabel() {
		super.getDetails();
		System.out.println("For External Use Only\n" );
		return null;
	}

}
