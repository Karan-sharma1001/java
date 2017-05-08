package day1_1;
import java.util.Date;
import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		 Medicine[] m=new Medicine[5];
		 Date d=new Date((2017-1900),2,14);
		 
		 for (int i = 0; i < m.length; i++) {
			int a=randInt(1, 3);
			switch (a) {
			case 1:
				Medicine t= new Tablet(); 
			
				t.setExpiry_date(d);
				t.setPrice(1000);
				t.displayLabel();
				
				break;
			case 2:
				Medicine s= new Syrup();
			
				s.setExpiry_date(d);
				s.setPrice(254);
				s.displayLabel();
					break;
			case 3:
				Medicine o= new Ointment(); 
				o.setExpiry_date(d);
				o.setPrice(961);
				o.displayLabel();
				break;
				
			default: System.out.println("Invalid input\n");
				break;
				
			}
		}
		 

	}
	
	public static int randInt(int min, int max) {

	 
	    Random rand= new Random();

	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}