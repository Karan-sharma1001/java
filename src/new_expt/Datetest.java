package new_expt;

import java.util.Date;
import java.util.Scanner;

public class Datetest {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		Date d=new  Date();
		System.out.println("Enter month");
		int mon=(a.nextInt()-1);
		System.out.println("Enter Day");
		int dat=a.nextInt();
		System.out.println("Enter Year");
		int year=a.nextInt()-1900;
		d.setDate(dat);
		d.setMonth(mon);
		d.setYear(year);
		System.out.println("Date is : "+d);
	}

}
