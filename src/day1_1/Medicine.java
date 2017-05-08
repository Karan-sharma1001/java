package day1_1;

import java.util.Date;

public abstract class Medicine {
	
	int price;
	Date expiry_date;
	 public void getDetails(){
		 System.out.println(price+"  is price"+"  and date is "+expiry_date);
		 
	 }
	 
	
	 public void setPrice(int price) {
		this.price = price;
	}


	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}


	public  abstract String displayLabel() ;
	 
}
